// validation.js
// Reusable validation middleware and common rules for WN Casino P2P

const { validationResult } = require('express-validator');

// General reusable middleware
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

// Example: Poker action validation rules
const pokerActionValidation = [
  // e.g., body('action').isIn(['fold', 'call', 'raise'])
  //   .withMessage('Invalid poker action'),
  // body('amount').optional().isInt({ min: 1 }).withMessage('Amount must be a positive integer'),
];

module.exports = {
  validate,
  pokerActionValidation,
};
