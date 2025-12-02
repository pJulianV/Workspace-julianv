const request = require('supertest');
const express = require('express');
const authRoutes = require('../src/users/auth');

const app = express();
app.use(express.json());
app.use('/api/auth', authRoutes);

describe('Auth Endpoints', () => {
  it('should register a new user', async () => {
    const res = await request(app)
      .post('/api/auth/register')
      .send({ username: 'testuser', password: 'testpass123', age: 25 });
    expect(res.statusCode).toEqual(201);
    expect(res.body.message).toBe('User registered successfully');
  });

  it('should not register duplicate user', async () => {
    await request(app)
      .post('/api/auth/register')
      .send({ username: 'testuser2', password: 'testpass123', age: 25 });
    const res = await request(app)
      .post('/api/auth/register')
      .send({ username: 'testuser2', password: 'testpass123', age: 25 });
    expect(res.statusCode).toEqual(409);
  });

  it('should login with correct credentials', async () => {
    await request(app)
      .post('/api/auth/register')
      .send({ username: 'testlogin', password: 'testpass123', age: 25 });
    const res = await request(app)
      .post('/api/auth/login')
      .send({ username: 'testlogin', password: 'testpass123' });
    expect(res.statusCode).toEqual(200);
    expect(res.body.token).toBeDefined();
  });

  it('should not login with wrong password', async () => {
    await request(app)
      .post('/api/auth/register')
      .send({ username: 'testfail', password: 'testpass123', age: 25 });
    const res = await request(app)
      .post('/api/auth/login')
      .send({ username: 'testfail', password: 'wrongpass' });
    expect(res.statusCode).toEqual(401);
  });
});
