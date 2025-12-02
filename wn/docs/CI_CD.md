# CI/CD Pipeline

- **GitHub Actions Workflow:**
	- Automated tests run on every push and pull request to the `main` branch.
	- Workflow file: `.github/workflows/ci.yml`.
	- Steps:
		1. Checkout code
		2. Set up Node.js
		3. Install backend dependencies
		4. Run all Jest tests

- **Best Practices:**
	- Run linting, tests, and security checks on every push.
	- Deploy to staging before production.
	- Require code review for all pull requests.
	- Store secrets in CI/CD environment, not in code.
