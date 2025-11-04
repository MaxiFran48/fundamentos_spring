# Instrucciones de Entrega - Trabajo Práctico Spring Boot

## ✅ Lista de Verificación del Proyecto

### Estructura de Archivos Completada

```
✓ src/main/java/com/utn/tareas/
  ✓ model/
    ✓ Prioridad.java (Enum con ALTA, MEDIA, BAJA)
    ✓ Tarea.java (Clase con Lombok)
  ✓ repository/
    ✓ TareaRepository.java (Anotada con @Repository)
  ✓ service/
    ✓ TareaService.java (Anotada con @Service)
    ✓ MensajeService.java (Interfaz)
    ✓ MensajeDevService.java (Implementación con @Profile("dev"))
    ✓ MensajeProdService.java (Implementación con @Profile("prod"))
  ✓ FundamentosSpringApplication.java (Implementa CommandLineRunner)

✓ src/main/resources/
  ✓ application.properties (Configuración base)
  ✓ application-dev.properties (Configuración de desarrollo)
  ✓ application-prod.properties (Configuración de producción)

✓ Archivos adicionales
  ✓ README.md (Documentación completa)
  ✓ .gitignore (Configurado para Java/Maven)
  ✓ pom.xml (Con todas las dependencias)
```

## 📋 Checklist de Funcionalidades Implementadas

### Parte 1: Proyecto Base ✅
- [x] Proyecto Maven con Spring Boot 3.x
- [x] Java 21
- [x] Dependencias: DevTools y Lombok
- [x] Estructura de paquetes profesional

### Parte 2: Modelo y Repositorio ✅
- [x] Enum Prioridad (ALTA, MEDIA, BAJA)
- [x] Clase Tarea con todos los atributos
- [x] TareaRepository con @Repository
- [x] Almacenamiento en memoria con List
- [x] Generación automática de IDs con AtomicLong
- [x] 5 tareas de ejemplo pre-cargadas
- [x] Métodos: guardar, obtenerTodas, buscarPorId, eliminarPorId

### Parte 3: Servicio de Lógica de Negocio ✅
- [x] TareaService con @Service
- [x] Inyección por constructor
- [x] agregarTarea() con validación de límite
- [x] listarTodas()
- [x] listarPendientes()
- [x] listarCompletadas()
- [x] marcarComoCompletada()
- [x] obtenerEstadisticas()

### Parte 4: Configuración con Properties ✅
- [x] Propiedades definidas: app.nombre, app.max-tareas, app.mostrar-estadisticas
- [x] Inyección con @Value
- [x] Validación de límite máximo de tareas
- [x] Método mostrarConfiguracion()

### Parte 5: Profiles ✅
- [x] application-dev.properties configurado
- [x] application-prod.properties configurado
- [x] Interfaz MensajeService
- [x] MensajeDevService con @Profile("dev")
- [x] MensajeProdService con @Profile("prod")
- [x] Mensajes diferenciados por entorno

### Parte 6: Clase Principal ✅
- [x] Implementa CommandLineRunner
- [x] Inyección por constructor
- [x] Flujo completo de ejecución:
  - [x] Mensaje de bienvenida
  - [x] Mostrar configuración
  - [x] Listar tareas iniciales
  - [x] Agregar nueva tarea
  - [x] Listar pendientes
  - [x] Marcar como completada
  - [x] Mostrar estadísticas
  - [x] Listar completadas
  - [x] Mensaje de despedida

## 🚀 Cómo Ejecutar el Proyecto

### Opción 1: Modo Desarrollo
```bash
./mvnw spring-boot:run
```

### Opción 2: Modo Producción
```bash
./mvnw spring-boot:run -Dspring-boot.run.profiles=prod
```

### Opción 3: Cambiar en application.properties
Editar `src/main/resources/application.properties`:
```properties
spring.profiles.active=prod  # Cambiar a 'dev' o 'prod'
```

## 📸 Capturas de Pantalla

### Modo Desarrollo (DEV)
- ✅ Ejecutar: `./mvnw spring-boot:run`
- ✅ Capturar salida completa mostrando:
  - Mensaje de bienvenida detallado
  - Configuración: max-tareas=10, mostrar-estadisticas=true
  - Todas las funcionalidades ejecutándose
  - Estadísticas mostradas
  - Mensaje de despedida amigable

### Modo Producción (PROD)
- ✅ Ejecutar: `./mvnw spring-boot:run -Dspring-boot.run.profiles=prod`
- ✅ Capturar salida completa mostrando:
  - Mensaje de bienvenida simple
  - Configuración: max-tareas=1000, mostrar-estadisticas=false
  - Todas las funcionalidades ejecutándose
  - SIN estadísticas
  - Mensaje de despedida conciso

## 📝 Actualizar README.md

Antes de subir a GitHub, actualiza las siguientes secciones en el README.md:

```markdown
## 👤 Información del Estudiante

- **Nombre:** [TU NOMBRE COMPLETO]
- **Legajo:** [TU NÚMERO DE LEGAJO]
```

También puedes agregar las capturas de pantalla directamente en el README.

## 📦 Preparar para GitHub

### 1. Inicializar Git (si no está inicializado)
```bash
git init
```

### 2. Agregar todos los archivos
```bash
git add .
```

### 3. Hacer commits significativos

Opción A - Un commit completo:
```bash
git commit -m "feat: Sistema completo de gestión de tareas con Spring Boot

- Implementación de modelo (Tarea y Prioridad)
- Repositorio con almacenamiento en memoria
- Servicio de lógica de negocio
- Configuración con properties y profiles
- CommandLineRunner con flujo completo
- Beans condicionales según entorno
- README profesional con documentación completa"
```

Opción B - Commits separados (más profesional):
```bash
git add src/main/java/com/utn/tareas/model/
git commit -m "feat: Agregar modelo de dominio (Tarea y Prioridad)"

git add src/main/java/com/utn/tareas/repository/
git commit -m "feat: Implementar repositorio con almacenamiento en memoria"

git add src/main/java/com/utn/tareas/service/TareaService.java
git commit -m "feat: Implementar servicio de lógica de negocio"

git add src/main/resources/
git commit -m "feat: Configurar properties y profiles (dev/prod)"

git add src/main/java/com/utn/tareas/service/Mensaje*.java
git commit -m "feat: Implementar beans condicionales con profiles"

git add src/main/java/com/utn/tareas/FundamentosSpringApplication.java
git commit -m "feat: Implementar CommandLineRunner con flujo completo"

git add README.md
git commit -m "docs: Agregar README profesional con documentación"

git add .gitignore
git commit -m "chore: Agregar .gitignore para Java/Maven"
```

### 4. Crear repositorio en GitHub
1. Ve a https://github.com
2. Click en "New repository"
3. Nombre: `sistema-gestion-tareas-spring`
4. Descripción: "Sistema de gestión de tareas desarrollado con Spring Boot"
5. Público
6. NO agregar README, .gitignore ni licencia (ya los tienes)

### 5. Conectar y subir
```bash
git branch -M main
git remote add origin https://github.com/TU-USUARIO/sistema-gestion-tareas-spring.git
git push -u origin main
```

## 📤 Entregar en Moodle

1. Copia el link de tu repositorio GitHub
2. Formato: `https://github.com/TU-USUARIO/sistema-gestion-tareas-spring`
3. Pega el link en la tarea de Moodle

## 🎯 Puntos Clave a Verificar Antes de Entregar

- [ ] El proyecto compila sin errores
- [ ] La aplicación se ejecuta correctamente en modo DEV
- [ ] La aplicación se ejecuta correctamente en modo PROD
- [ ] Los mensajes cambian según el profile
- [ ] Las estadísticas solo se muestran en DEV
- [ ] El README tiene tu nombre y legajo
- [ ] El README incluye (o referencia) las capturas
- [ ] El repositorio es público
- [ ] Todos los archivos están subidos a GitHub
- [ ] Los commits son descriptivos

## 💡 Consejos Profesionales

1. **Commits**: Usa mensajes descriptivos y en presente
   - ✅ "feat: Agregar repositorio de tareas"
   - ❌ "agregue el repositorio"

2. **README**: Incluye toda la información necesaria
   - Descripción clara del proyecto
   - Instrucciones de instalación y ejecución
   - Capturas de pantalla
   - Tu información personal

3. **Código**: Mantén un estilo consistente
   - Nombres de variables en español
   - Comentarios cuando sea necesario
   - Código limpio y ordenado

4. **GitHub**: Organiza tu repositorio
   - .gitignore apropiado
   - README en la raíz
   - Sin carpetas target/ o .idea/

## ✨ Extras Opcionales (Puntos Bonus)

Si quieres ir más allá, puedes:

- [ ] Agregar más estadísticas (tareas por prioridad)
- [ ] Implementar búsqueda de tareas por descripción
- [ ] Agregar validaciones adicionales
- [ ] Crear un logger personalizado
- [ ] Agregar tests unitarios
- [ ] Documentar el código con Javadoc

---

**¡Éxito con tu entrega!** 🚀

Si tienes dudas, revisa la documentación oficial de Spring Boot: https://spring.io/projects/spring-boot

