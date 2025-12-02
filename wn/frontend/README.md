# Frontend - WN Casino P2P

This frontend is designed to be developed with React and open source libraries for casino game interfaces.

## Main Technologies
- React.js
- Socket.io-client (real-time communication)
- Material-UI or Bootstrap (secure and modern UI)
- Web3.js or APIs for Bitcoin integration

## Suggested Structure
- `/src`
  - `/components` (game components: PokerTable, BlackjackTable, etc.)
  - `/pages` (main pages: Home, Login, Dashboard, Games)
  - `/services` (API, authentication, payments)
  - `App.js` (entry point)

## Security
- JWT authentication
- Input validation on frontend
- Mandatory HTTPS
- Protection against XSS/CSRF

## Recommended Open Source
- [react-poker](https://github.com/saulshanabrook/react-poker) (poker table)
- [react-blackjack](https://github.com/evanlucas/react-blackjack)
- [react-roulette-pro](https://github.com/justinmahar/react-roulette-pro)
- [material-ui](https://mui.com/)
- [socket.io-client](https://socket.io/docs/v4/client-api/)

## Installation
1. Clone this repository.
2. Install dependencies: `npm install`
3. Configure environment variables for API and payments.
4. Start the frontend: `npm start`

---

See `/docs` for legal and security details.