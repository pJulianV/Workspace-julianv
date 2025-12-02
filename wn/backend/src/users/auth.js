// auth.js
// Authentication and user management routes for WN Casino P2P

const express = require('express');
const bcrypt = require('bcrypt');
const jwt = require('jsonwebtoken');
const { body, validationResult } = require('express-validator');
const { users } = require('../users/user');

const router = express.Router();


// --- Reusable validation middleware ---
function validate(rules) {
  return async (req, res, next) => {
    await Promise.all(rules.map(validation => validation.run(req)));
    const errors = validationResult(req);
    if (!errors.isEmpty()) {
      return res.status(400).json({ errors: errors.array() });
    }
    next();
  };
}

// Register endpoint (with age field, validation, sanitization)
const registerValidation = [
  body('username')
    .isAlphanumeric().withMessage('Username must be alphanumeric')
    .isLength({ min: 3, max: 20 }).withMessage('Username must be 3-20 characters')
    .trim().escape(),
  body('password')
    .isLength({ min: 6 }).withMessage('Password must be at least 6 characters')
    .trim(),
  body('age')
    .isInt({ min: 18, max: 120 }).withMessage('Age must be 18 or older')
    .toInt(),
];

router.post('/register', validate(registerValidation), async (req, res) => {
  const { username, password, age } = req.body;
  if (users.find(u => u.username === username)) {
    return res.status(409).json({ error: 'Username already exists' });
  }
  const hash = await bcrypt.hash(password, 10);
  const user = { username, password: hash, age, balance: 0, role: 'user' };
  users.push(user);
  res.status(201).json({ message: 'User registered successfully' });
});

// Login endpoint (validation, sanitization)
const loginValidation = [
  body('username')
    .isAlphanumeric().withMessage('Username must be alphanumeric')
    .trim().escape(),
  body('password')
    .isLength({ min: 6 }).withMessage('Password must be at least 6 characters')
    .trim(),
];

router.post('/login', validate(loginValidation), async (req, res) => {
  const { username, password } = req.body;
  const user = users.find(u => u.username === username);
  if (!user) {
    return res.status(401).json({ error: 'Invalid credentials' });
  }
  const valid = await bcrypt.compare(password, user.password);
  if (!valid) {
    return res.status(401).json({ error: 'Invalid credentials' });
  }
  const token = jwt.sign({ username: user.username, role: user.role }, process.env.JWT_SECRET || 'secret_key', { expiresIn: '1h' });
  res.json({ token });
});

module.exports = router;
