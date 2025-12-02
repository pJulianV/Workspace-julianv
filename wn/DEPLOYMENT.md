# Estructura y despliegue de WN Casino P2P

## Estructura general
- `/backend`: Lógica de negocio, API, juegos, pagos y seguridad
- `/frontend`: Interfaz web para usuarios
- `/docs`: Documentación legal, técnica y de seguridad

## Despliegue seguro

### Recomendaciones
- Usar HTTPS en frontend y backend
- Configurar variables de entorno para claves y endpoints sensibles
- Desplegar backend en servicios como Google Cloud Run, AWS ECS, Azure App Service o VPS seguro
- Desplegar frontend en Vercel, Netlify, Firebase Hosting o similar
- Usar bases de datos seguras y cifradas (ej: PostgreSQL, MongoDB Atlas)
- Integrar monitoreo y alertas de seguridad

### Ejemplo de despliegue local
1. Instala dependencias en backend y frontend (`npm install` en cada carpeta)
2. Inicia backend (`npm run dev` o `npm start`)
3. Inicia frontend (`npm start`)
4. Accede a http://localhost:3000 (frontend) y http://localhost:4000 (backend)

---

Consulta los archivos INSTALL.md en cada carpeta para instrucciones detalladas.