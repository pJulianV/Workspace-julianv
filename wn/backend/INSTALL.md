# Instalación y uso del backend WN Casino P2P

## Requisitos
- Node.js >= 18
- npm >= 9

## Instalación

1. Instala las dependencias:
   ```sh
   npm install
   ```

2. Inicia el servidor en modo desarrollo (con recarga automática):
   ```sh
   npm run dev
   ```
   O en modo producción:
   ```sh
   npm start
   ```

3. El backend estará disponible en http://localhost:4000

## Estructura de carpetas
- `src/server.js`: Punto de entrada del backend
- `src/games/`: Lógica de juegos (poker, blackjack, ruleta, etc.)
- `src/users/`: Gestión de usuarios
- `src/wallet/`: Gestión de saldos y pagos
- `src/bets/`: Gestión de apuestas P2P

## Seguridad
- JWT para autenticación
- Bcrypt para contraseñas
- CORS habilitado

## Próximos pasos
- Implementar endpoints REST para juegos y apuestas
- Integrar pagos Bitcoin
- Añadir más juegos y lógica de emparejamiento

---

Consulta la documentación en `/docs` para temas legales y de seguridad.