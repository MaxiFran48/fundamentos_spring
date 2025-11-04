# Resumen del Proyecto - Sistema de Gestión de Tareas

## 📊 Resumen Ejecutivo

Este proyecto implementa un sistema completo de gestión de tareas (To-Do List) utilizando Spring Boot, aplicando todas las buenas prácticas profesionales de desarrollo.

## 🎯 Objetivos Cumplidos

### 1. Arquitectura en Capas
- **Capa de Modelo**: Entidades de dominio (Tarea, Prioridad)
- **Capa de Repositorio**: Acceso a datos con TareaRepository
- **Capa de Servicio**: Lógica de negocio con TareaService
- **Capa de Aplicación**: Punto de entrada con FundamentosSpringApplication

### 2. Conceptos de Spring Boot Implementados

#### Inyección de Dependencias
- ✅ Inyección por constructor (buena práctica)
- ✅ Uso de @Autowired implícito
- ✅ Inversión de Control (IoC)

#### Estereotipos de Spring
- ✅ @SpringBootApplication
- ✅ @Repository
- ✅ @Service
- ✅ @Component (implícito en @Service)

#### Configuración
- ✅ application.properties
- ✅ application-dev.properties
- ✅ application-prod.properties
- ✅ @Value para inyección de propiedades

#### Profiles
- ✅ @Profile("dev")
- ✅ @Profile("prod")
- ✅ Beans condicionales según entorno

#### Interfaces y Polimorfismo
- ✅ MensajeService (interfaz)
- ✅ MensajeDevService (implementación)
- ✅ MensajeProdService (implementación)

#### Inicialización
- ✅ CommandLineRunner
- ✅ Método run() con lógica de inicio

## 📁 Estructura del Proyecto

```
fundamentos_spring/
│
├── src/main/java/com/utn/tareas/
│   ├── model/
│   │   ├── Prioridad.java          # Enum con niveles de prioridad
│   │   └── Tarea.java              # Entidad principal
│   │
│   ├── repository/
│   │   └── TareaRepository.java    # Capa de datos en memoria
│   │
│   ├── service/
│   │   ├── MensajeService.java     # Interfaz de mensajes
│   │   ├── MensajeDevService.java  # Impl para desarrollo
│   │   ├── MensajeProdService.java # Impl para producción
│   │   └── TareaService.java       # Lógica de negocio
│   │
│   └── FundamentosSpringApplication.java  # Clase principal
│
├── src/main/resources/
│   ├── application.properties          # Config base
│   ├── application-dev.properties      # Config desarrollo
│   └── application-prod.properties     # Config producción
│
├── README.md                          # Documentación principal
├── INSTRUCCIONES_ENTREGA.md          # Guía de entrega
├── .gitignore                        # Archivos ignorados
├── pom.xml                           # Dependencias Maven
├── ejecutar-dev.sh                   # Script modo DEV
├── ejecutar-prod.sh                  # Script modo PROD
└── ejecutar-ambos-profiles.sh        # Script comparativo

```

## 🔧 Funcionalidades Implementadas

### TareaRepository
- `guardar(Tarea)` - Guarda una tarea con ID automático
- `obtenerTodas()` - Retorna todas las tareas
- `buscarPorId(Long)` - Busca por ID (retorna Optional)
- `eliminarPorId(Long)` - Elimina una tarea

### TareaService
- `agregarTarea(String, Prioridad)` - Agrega con validación de límite
- `listarTodas()` - Lista todas las tareas
- `listarPendientes()` - Filtra tareas no completadas
- `listarCompletadas()` - Filtra tareas completadas
- `marcarComoCompletada(Long)` - Cambia estado de tarea
- `obtenerEstadisticas()` - Genera reporte formateado
- `mostrarConfiguracion()` - Muestra config actual

### MensajeService
- `mostrarBienvenida()` - Mensaje inicial según entorno
- `mostrarDespedida()` - Mensaje final según entorno

## 🌐 Configuración por Entorno

### Desarrollo (DEV)
```properties
app.max-tareas=10
app.mostrar-estadisticas=true
logging.level.com.utn.tareas=DEBUG
```

**Características:**
- Límite bajo de tareas para pruebas
- Estadísticas habilitadas
- Logs detallados
- Mensajes amigables y educativos

### Producción (PROD)
```properties
app.max-tareas=1000
app.mostrar-estadisticas=false
logging.level.com.utn.tareas=ERROR
```

**Características:**
- Límite alto de tareas
- Estadísticas deshabilitadas
- Logs mínimos (solo errores)
- Mensajes concisos

## 🚀 Comandos Útiles

### Compilar
```bash
./mvnw clean compile
```

### Empaquetar
```bash
./mvnw clean package
```

### Ejecutar con Maven
```bash
# Modo desarrollo
./mvnw spring-boot:run

# Modo producción
./mvnw spring-boot:run -Dspring-boot.run.profiles=prod
```

### Ejecutar con JAR
```bash
# Compilar primero
./mvnw clean package -DskipTests

# Ejecutar
java -jar target/tareas-0.0.1-SNAPSHOT.jar

# Con profile específico
java -jar -Dspring.profiles.active=prod target/tareas-0.0.1-SNAPSHOT.jar
```

### Ejecutar con Scripts
```bash
# Modo desarrollo
./ejecutar-dev.sh

# Modo producción
./ejecutar-prod.sh
```

## 📚 Conceptos Clave Aprendidos

### 1. Inversión de Control (IoC)
Spring gestiona la creación y ciclo de vida de los objetos (beans). No creamos instancias manualmente.

### 2. Inyección de Dependencias (DI)
Las dependencias se inyectan automáticamente por Spring, preferiblemente por constructor.

### 3. Estereotipos
- `@Repository`: Componentes de acceso a datos
- `@Service`: Componentes de lógica de negocio
- `@Component`: Componentes genéricos

### 4. Profiles
Permiten diferentes configuraciones según el entorno (dev, test, prod).

### 5. Properties
Externalizan la configuración, facilitando cambios sin recompilar.

### 6. CommandLineRunner
Interfaz para ejecutar código al iniciar la aplicación.

## 🎓 Buenas Prácticas Aplicadas

1. ✅ **Inyección por constructor**: Más testeable y segura
2. ✅ **Separación de responsabilidades**: Cada clase tiene un propósito claro
3. ✅ **Uso de Optional**: Manejo seguro de valores que pueden ser null
4. ✅ **Nomenclatura clara**: Nombres descriptivos en español
5. ✅ **Lombok**: Reducción de boilerplate con @Data
6. ✅ **Generación automática de IDs**: Con AtomicLong thread-safe
7. ✅ **Configuración por entorno**: Profiles para dev y prod
8. ✅ **Interfaces para abstracción**: MensajeService

## 📈 Flujo de Ejecución

```
1. SpringApplication.run()
   ↓
2. Spring crea el ApplicationContext
   ↓
3. Spring escanea y crea beans
   - TareaRepository (@Repository)
   - TareaService (@Service) ← inyecta TareaRepository
   - MensajeDevService o MensajeProdService (@Service + @Profile)
   - FundamentosSpringApplication
   ↓
4. Spring inyecta dependencias en FundamentosSpringApplication
   ↓
5. Ejecuta método run() de CommandLineRunner
   - Muestra bienvenida
   - Muestra configuración
   - Lista tareas
   - Agrega tarea
   - Lista pendientes
   - Marca completada
   - Muestra estadísticas (si está habilitado)
   - Lista completadas
   - Muestra despedida
   ↓
6. Aplicación finaliza
```

## 🔍 Detalles Técnicos

### Almacenamiento
- En memoria con `List<Tarea>`
- No persiste entre ejecuciones
- Ideal para demostración y testing

### Generación de IDs
- Usa `AtomicLong` (thread-safe)
- Incremental desde 1
- Automático en `guardar()`

### Validaciones
- Límite máximo de tareas
- Verificación de ID en `buscarPorId()`
- Control de estado en `marcarComoCompletada()`

## 🌟 Ventajas de Este Diseño

1. **Escalable**: Fácil agregar nuevas funcionalidades
2. **Mantenible**: Código organizado y claro
3. **Testeable**: Inyección de dependencias facilita testing
4. **Flexible**: Configuración externalizada
5. **Profesional**: Sigue estándares de la industria

## 🎯 Posibles Mejoras Futuras

- [ ] Persistencia con JPA/Hibernate
- [ ] API REST con Spring Web
- [ ] Tests unitarios con JUnit
- [ ] Tests de integración
- [ ] Seguridad con Spring Security
- [ ] Frontend con Thymeleaf o React
- [ ] Dockerización
- [ ] CI/CD con GitHub Actions

## 📞 Soporte

- **Documentación Spring Boot**: https://spring.io/projects/spring-boot
- **Guías Spring**: https://spring.io/guides
- **Maven**: https://maven.apache.org/

---

**Proyecto desarrollado como parte del Trabajo Práctico de Fundamentos de Spring Boot**

*Universidad Tecnológica Nacional (UTN)*

