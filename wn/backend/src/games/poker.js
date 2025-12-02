
// poker.js
// Basic Texas Hold'em Poker logic using poker-evaluator

const PokerEvaluator = require('poker-evaluator');

// Example function to evaluate poker hands
function evaluateHands(players) {
  // players: array of objects { name, cards: ['As', 'Kd', ...] }
  // community cards (flop, turn, river)
  const community = ['Ah', 'Ks', 'Qc', 'Jd', '10s'];
  return players.map(p => {
    const hand = p.cards.concat(community);
    const result = PokerEvaluator.evalHand(hand);
    return {
      name: p.name,
      hand: hand,
      value: result.value,
      description: result.handName
    };
  });
}

module.exports = { evaluateHands };
