# AWS Secrets Management

This guide explains how to securely manage secrets using AWS Secrets Manager.

## Steps
1. Create an AWS account and set up IAM users/roles.
2. Store secrets in AWS Secrets Manager.
3. Grant least-privilege access to backend services.
4. Use the AWS SDK to fetch secrets at runtime.

## Example: Fetching Secrets in Node.js
```js
const AWS = require('aws-sdk');
const client = new AWS.SecretsManager({ region: 'us-east-1' });

async function getSecret(secretName) {
  const data = await client.getSecretValue({ SecretId: secretName }).promise();
  return JSON.parse(data.SecretString);
}
```

See [AWS Docs](https://docs.aws.amazon.com/secretsmanager/latest/userguide/intro.html) for more details.
