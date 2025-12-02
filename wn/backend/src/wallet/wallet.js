
// wallet.js
// Basic balance and payment management (mock, use real API for Bitcoin)

const { users } = require('../users/user');

function deposit(username, amount) {
  const user = users.find(u => u.username === username);
  if (user) {
    user.balance += amount;
    return true;
  }
  return false;
}

function withdraw(username, amount) {
  const user = users.find(u => u.username === username);
  if (user && user.balance >= amount) {
    user.balance -= amount;
    return true;
  }
  return false;
}

module.exports = { deposit, withdraw };
