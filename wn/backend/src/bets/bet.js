
// bet.js
// Basic P2P bet management

const bets = [];

function createBet(game, players, amount) {
  const bet = {
    id: bets.length + 1,
    game,
    players, // array of usernames
    amount,
    status: 'pending'
  };
  bets.push(bet);
  return bet;
}

function resolveBet(id, winner) {
  const bet = bets.find(b => b.id === id);
  if (bet && bet.status === 'pending') {
    bet.status = 'resolved';
    bet.winner = winner;
    return bet;
  }
  return null;
}

module.exports = { createBet, resolveBet };
