

# WN - Secure P2P Betting Platform

Welcome to WN, a global peer-to-peer betting platform with Bitcoin and fiat integration, focused on maximum security, transparency, and legal compliance.

---


# Backend - WN Casino P2P

This backend is based on Node.js and Express, integrating open source libraries for casino games and security.

## Main Technologies
- Node.js
- Express.js
- Socket.io (real-time games)
- JWT (secure authentication)
- Bcrypt (password hashing)
- Bitcore-lib or external APIs for Bitcoin
- Open source libraries for game logic (see references)

## Suggested Structure
- `/src`
  - `/games` (game logic: poker, blackjack, roulette, etc.)
  - `/users` (user management and authentication)
  - `/wallet` (balance and Bitcoin payment management)
  - `/bets` (P2P bet management)
  - `server.js` (entry point)
- `/config` (security configuration, keys, etc.)

## Security
- JWT authentication
- Password hashing with Bcrypt
- Input validation
- Audit logs
- Integration with secure Bitcoin payment providers

## Recommended Open Source
- [Poker Evaluator](https://github.com/chehsunliu/poker-evaluator) (Texas Hold'em)
- [blackjack-js](https://github.com/evanlucas/blackjack-js)
- [roulette](https://github.com/andrewjmead/roulette)
- [socket.io](https://socket.io/)
- [jsonwebtoken](https://github.com/auth0/node-jsonwebtoken)
- [bcrypt](https://github.com/kelektiv/node.bcrypt.js)

## Installation
1. Clone this repository.
2. Install dependencies: `npm install`
3. Configure environment variables and keys in `/config`.
4. Start the server: `npm start`

---

See `/docs` for legal and security details.

## Development Timeline & Regular Updates

- **Project Start:** December 1, 2025
- **Weekly Dev/Testing Cycle:** Every Monday (code review, planning, new features)
- **Manual QA/Regression Testing:** Every Friday
- **Dependency & Security Audit:** 1st of every month
- **CI/CD Pipeline Review:** 15th of every month
- **Major Milestone Reviews:**
  - MVP Backend Complete: December 22, 2025
  - MVP Frontend Complete: January 12, 2026
  - Compliance & Payments Complete: February 2, 2026
  - Community & Advanced Features: March 2, 2026
  - Public Beta: March 16, 2026
  - Ongoing: Weekly sprints, monthly audits, quarterly roadmap updates

---


## Secrets & Environment Management Best Practices

- Never commit `.env` or real secrets to version control. Use `.env.example` for documentation.
- Always add `.env` to `.gitignore`.
- Use `dotenv` to load secrets in local/dev environments.
- Access secrets only via `process.env` in code—never hardcode secrets.
- Use different `.env` files for development, testing, and production.
- For production, use a cloud secret manager (AWS Secrets Manager, Azure Key Vault, Google Secret Manager) and inject secrets as environment variables.
- Rotate secrets regularly and after any suspected leak.
- Limit secret scope and use least privilege for API keys/tokens.
- Monitor dependencies and secrets for vulnerabilities (npm audit, Dependabot).
- Keep `.env.example` up to date for onboarding and CI/CD.
- Ensure backups of secret stores are encrypted and access-controlled.


### 0. Project Quality, CI/CD & Testing (Ongoing)
- [ ] Set up version control (Git, GitHub, branch protection, enforce .gitignore for secrets)
- [ ] Configure CI/CD pipeline (GitHub Actions: lint, test, build, deploy, secret scanning)
- [ ] Enforce code style and linting (ESLint, Prettier, pre-commit hooks)
- [ ] Set up automated unit tests (Jest, Supertest, coverage reports)
- [ ] Set up automated integration tests (test all endpoints, validation, and error handling)
- [ ] Set up manual QA testing checklist (security, validation, UI/UX)
- [ ] Add code review process (PRs, approvals, security review)
- [ ] Monitor code coverage and maintain high coverage (require for merge)
- [ ] Document all endpoints and validation rules (OpenAPI/Swagger, keep up to date)
- [ ] Monitor dependencies for vulnerabilities (Dependabot, npm audit, regular review)

### 1. Minimum Viable Product (MVP)
#### 1.1 Backend Security & Foundation
- [ ] Initialize backend project structure (modular, documented, secure defaults)
- [ ] Install and configure core dependencies (Express, dotenv, helmet, etc.; follow security best practices)
- [ ] Secure backend setup (JWT for auth, bcrypt for passwords, helmet for headers, CORS, rate limiting; review config regularly)
- [ ] Input validation and data sanitization (express-validator, reusable middleware, sanitize all user input)
- [ ] Secure management of secrets and environment variables (dotenv, .env, .env.example, .gitignore, secret manager for prod, rotate secrets)
- [ ] Enforce HTTPS and secure CORS configuration (only allow trusted origins, HSTS)
- [ ] Set up logging (morgan, log rotation, redact sensitive data)

#### 1.2 User Management
- [ ] User registration endpoint (with age field, validation, sanitization, no PII leaks)
- [ ] User login endpoint (validation, sanitization, rate limiting, no PII leaks)
- [ ] Store users securely (hashed passwords, minimal PII, access control, regular review)
- [ ] Basic admin/user role separation (RBAC middleware, least privilege, audit access)
- [ ] Secure session and token management (JWT best practices, token expiry, refresh, blacklist on logout)

#### 1.3 Game Logic & Fun Mode
- [ ] Implement core game logic: poker (input validation, fair play, no trust in client)
- [ ] Implement core game logic: blackjack (input validation, fair play, no trust in client)
- [ ] Implement core game logic: roulette (input validation, fair play, no trust in client)
- [ ] Allow all users to play in fun mode (no real money, no registration required, safe defaults)
- [ ] Clearly separate fun and betting modes in UI and backend (no cross-leakage, clear user messaging)

#### 1.4 Frontend MVP
- [ ] Modern, responsive UI (web, React + Material-UI/Bootstrap, accessibility, security in forms)
- [ ] User registration/login forms (with validation feedback, no sensitive data in client logs)
- [ ] Game lobby and game UIs (fun mode, input validation, no XSS)
- [ ] Error and success feedback for all actions (user-friendly, no sensitive info)

#### 1.5 Security & Testing
- [ ] Protection against XSS, CSRF, brute force (helmet, csurf, rate-limiter-flexible, input/output encoding)
- [ ] Endpoint and business logic testing (Jest, Supertest, test coverage reports)
- [ ] Manual QA for all MVP features (test cases, regression tests, security checks)

### 2. Compliance & Payments
#### 2.1 User Verification
- [ ] Integrate age verification during registration (DOB, logic, UI feedback, validation, audit logs)
- [ ] Implement KYC process (ID upload, verification, admin review, secure storage, audit logs)
- [ ] Block underage or unverified users from betting/payment features (middleware, UI feedback, logging)
- [ ] Require age verification and KYC before enabling betting or Bitcoin features (enforced in backend, tested)
- [ ] Block underage users from accessing betting or Bitcoin (strict checks, regular review)

#### 2.2 Payments
- [ ] Integrate Bitcoin payment gateway (Coinbase Commerce, BitPay, etc.; secrets via env/secret manager, audit logs)
- [ ] Integrate fiat payment processor (Stripe, PayPal, etc.; secrets via env/secret manager, audit logs)
- [ ] Ensure all payment flows require KYC completion (middleware, backend checks, tested)
- [ ] Add geo-restriction for legal compliance (middleware, UI feedback, config, regular review)
- [ ] Display responsible gaming and legal notices (UI, onboarding, footer, compliance, regular review)

### 3. Betting, Community & Advanced Features
#### 3.1 Betting & P2P
- [ ] P2P bet creation and management (Socket.io, backend, UI, input validation, anti-fraud, audit logs)
- [ ] Transparent commission system (logic, UI display, auditability, regular review)

#### 3.2 User Experience & Community
- [ ] User and admin dashboards (React, Material-UI, backend endpoints, RBAC, audit logs)
- [ ] Rankings, achievements, and rewards (backend logic, Chart.js, UI, anti-cheat, audit logs)
- [ ] Real-time chat and community features (Socket.io, react-chat-widget, moderation, logging)
- [ ] Mobile app (React Native, Expo, shared logic, secure storage, regular security review)
- [ ] Animations and visual feedback (Framer Motion, react-spring, accessibility, no performance regressions)
- [ ] Sounds and effects for plays and wins (Howler.js, user controls, accessibility)

#### 3.3 Fairness & Security
- [ ] Provably fair games and open-source libraries (document, audit, public verification, regular review)
- [ ] Security audits and bug bounties (plan, execute, report, responsible disclosure, regular schedule)

---

---

## Multi-Platform Strategy

WN will be available as both a browser-based web app and a mobile app:

- **Web App:** Built with React, fully responsive for desktop and mobile browsers. Uses Material-UI/Bootstrap for modern, adaptive design.
- **Mobile App:** Built with React Native (Expo), cross-platform for iOS and Android. Shares business logic and UI components with the web version where possible.

## Game Modes: Fun & Betting

WN will offer two modes for all games:

- **Fun Mode (No Betting):** Play for entertainment only, with no real money or cryptocurrency involved. No risk, no winnings, just pure fun and social competition.
- **Betting Mode (Optional):** For users who wish to wager, a secure P2P betting system is available. All betting features are opt-in and subject to strict security and legal compliance.

This dual approach ensures WN is accessible and enjoyable for everyone, regardless of whether they want to bet or just play for fun.

## Industry Best Practices & References
- Inspired by leading platforms like Stake, Roobet, and BetFury:
  - Global access, English-first interface
  - Provably fair games and open-source libraries
  - Strict KYC/AML compliance
  - Bitcoin and crypto payments
  - Security audits and bug bounties

## Legal Notice
Use of this platform is subject to local laws. Users are responsible for complying with their jurisdiction's gambling and cryptocurrency regulations.

---

Developed by the WN team.
