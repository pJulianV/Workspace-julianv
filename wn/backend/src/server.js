
// server.js
// Punto de entrada del backend WN Casino P2P

require('dotenv').config();
const express = require('express');
const http = require('http');
const socketIo = require('socket.io');
const cors = require('cors');

const helmet = require('helmet');
const morgan = require('morgan');
const jwt = require('jsonwebtoken');
const bodyParser = require('body-parser');
const rateLimit = require('express-rate-limit');
const logger = require('./logger');


const app = express();

// Enforce HTTPS in production
if (process.env.NODE_ENV === 'production') {
  app.use((req, res, next) => {
    if (req.headers['x-forwarded-proto'] !== 'https') {
      return res.redirect('https://' + req.headers.host + req.url);
    }
    next();
  });
}

// Secure CORS configuration
const allowedOrigins = process.env.CORS_ORIGINS ? process.env.CORS_ORIGINS.split(',') : ['http://localhost:3000'];
const corsOptions = {
  origin: function (origin, callback) {
    // allow requests with no origin (like mobile apps, curl, etc.)
    if (!origin) return callback(null, true);
    if (allowedOrigins.indexOf(origin) !== -1) {
      return callback(null, true);
    } else {
      return callback(new Error('Not allowed by CORS'));
    }
  },
  credentials: true,
};

const server = http.createServer(app);
const io = socketIo(server, { cors: { origin: allowedOrigins, credentials: true } });


// Security Middlewares
app.use(helmet());
app.use(cors(corsOptions));
app.use(bodyParser.json());
app.use(morgan('combined', { stream: { write: msg => logger.info(msg.trim()) } }));

// Rate Limiting
const limiter = rateLimit({
  windowMs: 15 * 60 * 1000, // 15 minutes
  max: 100, // limit each IP to 100 requests per windowMs
});
app.use(limiter);


// Import authentication routes
const authRoutes = require('./users/auth');
const { authorizeRoles } = require('./middleware/role');
// Auth routes
app.use('/api/auth', authRoutes);


// Example protected route
app.get('/api/protected', authenticateToken, (req, res) => {
  res.json({ message: 'This is a protected route', user: req.user });
});

// Example admin-only route
app.get('/api/admin', authenticateToken, authorizeRoles('admin'), (req, res) => {
  res.json({ message: 'Welcome, admin!', user: req.user });
});

function authenticateToken(req, res, next) {
  const authHeader = req.headers['authorization'];
  const token = authHeader && authHeader.split(' ')[1];
  if (!token) {
    logger.warn(`Unauthorized access attempt from IP: ${req.ip}`);
    return res.sendStatus(401);
  }
  jwt.verify(token, process.env.JWT_SECRET || 'secret_key', (err, user) => {
    if (err) {
      logger.warn(`Invalid token from IP: ${req.ip}`);
      return res.sendStatus(403);
    }
    req.user = user;
    next();
  });
}

// Basic route
app.get('/', (req, res) => {
  res.send('Welcome to WN Casino P2P Backend - Secure Version');
});

// Socket.io for real-time games
io.on('connection', (socket) => {
  console.log('User connected:', socket.id);
  socket.on('disconnect', () => {
    console.log('User disconnected:', socket.id);
  });
});

const PORT = process.env.PORT || 4000;
server.listen(PORT, () => {
  console.log(`Secure WN Casino P2P backend listening on port ${PORT}`);
});
