# Instalación y uso del frontend WN Casino P2P

## Requisitos
- Node.js >= 18
- npm >= 9

## Instalación

1. Instala las dependencias:
   ```sh
   npm install
   ```

2. Inicia el frontend:
   ```sh
   npm start
   ```

3. El frontend estará disponible en http://localhost:3000

## Estructura de carpetas
- `src/components/`: Componentes de juegos y UI
- `src/pages/`: Páginas principales
- `src/services/`: Servicios de API y pagos
- `src/App.js`: Punto de entrada de la app

## Seguridad
- Autenticación JWT
- Validación de inputs
- HTTPS recomendado

## Próximos pasos
- Crear componentes de juegos (poker, blackjack, ruleta)
- Integrar pagos Bitcoin
- Conectar con el backend vía API y Socket.io

---

Consulta la documentación en `/docs` para temas legales y de seguridad.