# Environment Variables

## Local Development
- Use a `.env` file for local secrets and configuration.
- Never commit `.env` files to version control.

## Production
- Use AWS Secrets Manager or environment variables set by your cloud provider.

## Example `.env.example`
```
PORT=3000
JWT_SECRET=your_jwt_secret
DB_URI=your_database_uri
AWS_ACCESS_KEY_ID=your_access_key
AWS_SECRET_ACCESS_KEY=your_secret_key
```
