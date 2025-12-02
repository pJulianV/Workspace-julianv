
// user.js
// Basic user management (registration, authentication, balance)

const bcrypt = require('bcrypt');
const users = [];

async function registerUser(username, password) {
  const hash = await bcrypt.hash(password, 10);
  const user = { username, password: hash, balance: 0 };
  users.push(user);
  return user;
}

async function authenticateUser(username, password) {
  const user = users.find(u => u.username === username);
  if (!user) return false;
  const valid = await bcrypt.compare(password, user.password);
  return valid ? user : false;
}

module.exports = { registerUser, authenticateUser, users };
