# Testing & QA

- **Automated Testing:**
	- All backend tests are written using [Jest](https://jestjs.io/) and [Supertest](https://github.com/visionmedia/supertest).
	- Test files are located in `backend/tests/` and follow the `*.test.js` naming convention.
	- Example: `backend/tests/auth.test.js` covers registration and login endpoints.

- **Running Tests Locally:**
	- From the `backend` directory, run: `npx jest --config jest.config.js --runInBand`
	- Coverage reports are generated in the `coverage/` folder.

- **CI/CD Integration:**
	- Automated tests run on every push and pull request via GitHub Actions (`.github/workflows/ci.yml`).
	- The workflow installs dependencies and runs all tests to ensure code quality before merging.

- **Best Practices:**
	- Write unit, integration, and end-to-end tests for all features.
	- Track code coverage and aim for >80%.
	- Perform manual QA before major releases.
