## 🔑 Características Implementadas

### ✅ Parte 1: Proyecto Base
- Proyecto Maven configurado con Spring Boot 3.x
- Dependencias: DevTools y Lombok
- Estructura de paquetes profesional

### ✅ Parte 2: Modelo y Repositorio
- Enum `Prioridad` con tres niveles
- Clase `Tarea` con todos los atributos requeridos
- `TareaRepository` con almacenamiento en memoria
- Generación automática de IDs con `AtomicLong`
- Datos de ejemplo pre-cargados

### ✅ Parte 3: Servicio de Lógica de Negocio
- `TareaService` con inyección por constructor
- Métodos para todas las operaciones CRUD
- Filtrado de tareas por estado
- Sistema de estadísticas formateado

### ✅ Parte 4: Configuración con Properties
- Propiedades personalizadas en `application.properties`
- Inyección de valores con `@Value`
- Validación de límite máximo de tareas

### ✅ Parte 5: Profiles para Diferentes Entornos
- Configuración separada para dev y prod
- Beans condicionales con `@Profile`
- Diferentes implementaciones de `MensajeService`

### ✅ Parte 6: Clase Principal y Ejecución
- Implementación de `CommandLineRunner`
- Flujo completo de demostración
- Formateo profesional de salida

## 🎯 Conceptos de Spring Boot Aplicados

1. **Inyección de Dependencias**: Constructor injection en servicios
2. **Estereotipos**: `@Repository`, `@Service`, `@Component`
3. **Configuración**: Properties files y `@Value`
4. **Profiles**: Configuración multi-entorno con `@Profile`
5. **Beans Condicionales**: Activación según profile activo
6. **CommandLineRunner**: Ejecución de lógica al inicio
7. **Lombok**: Reducción de boilerplate con `@Data`
8. **Arquitectura en Capas**: Separación clara de responsabilidades

## 💭 Conclusiones Personales

Este proyecto ha sido fundamental para comprender los conceptos esenciales de Spring Boot:

- **Inyección de Dependencias**: Entendí la importancia de la inversión de control y cómo Spring gestiona automáticamente las dependencias entre componentes.

- **Arquitectura en Capas**: Aprendí a estructurar una aplicación siguiendo el patrón de capas (Modelo, Repositorio, Servicio), lo cual facilita el mantenimiento y escalabilidad.

- **Profiles**: Descubrí cómo gestionar diferentes entornos de forma elegante, permitiendo que la misma aplicación se comporte diferente según el contexto.

- **Buenas Prácticas**: La inyección por constructor, el uso de interfaces, y la separación de responsabilidades son prácticas que hacen el código más profesional y mantenible.

- **Spring Boot**: La configuración automática y el enfoque "convention over configuration" hacen que Spring Boot sea una herramienta poderosa para desarrollar aplicaciones empresariales rápidamente.

Este proyecto me ha dado las bases sólidas para continuar desarrollando aplicaciones más complejas con Spring Boot, y entender por qué es el framework más utilizado en el ecosistema Java empresarial.

## 📚 Referencias

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Spring Framework Documentation](https://docs.spring.io/spring-framework/docs/current/reference/html/)
- [Maven Documentation](https://maven.apache.org/guides/)
- [Project Lombok](https://projectlombok.org/)

## 📄 Licencia

Este proyecto está licenciado bajo la Licencia MIT - ver el archivo [LICENSE](LICENSE) para más detalles.

Copyright (c) 2025 Máximo Fran

---

⭐ Si este proyecto te fue útil, no olvides darle una estrella en GitHub!

**Desarrollado con ❤️ usando Spring Boot por Máximo Fran**
# 📋 Sistema de Gestión de Tareas (To-Do List)

Sistema completo de gestión de tareas desarrollado con Spring Boot que aplica buenas prácticas profesionales de desarrollo.

## 👤 Información del Estudiante

- **Nombre:** Maximo Fran
- **Legajo:** 50903

## 📝 Descripción del Proyecto

Este proyecto es una aplicación Spring Boot completa que implementa un sistema de gestión de tareas (To-Do List) con las siguientes características:

- ✅ Gestión completa de tareas (CRUD)
- 🎯 Sistema de prioridades (Alta, Media, Baja)
- 📊 Estadísticas de tareas completadas y pendientes
- 🔧 Configuración con múltiples entornos (dev/prod)
- 🏗️ Arquitectura en capas con separación de responsabilidades
- 💉 Inyección de dependencias por constructor
- 🌐 Uso de Profiles para diferentes entornos

## ⚙️ Tecnologías Utilizadas

- **Java 21** - Lenguaje de programación
- **Spring Boot 3.5.7** - Framework principal
- **Maven** - Gestor de dependencias y construcción
- **Lombok** - Reducción de código boilerplate
- **Spring Boot DevTools** - Herramientas de desarrollo

## 🏗️ Estructura del Proyecto

```
src/main/java/com/utn/tareas/
├── model/
│   ├── Tarea.java           # Entidad de dominio
│   └── Prioridad.java       # Enum de prioridades
├── repository/
│   └── TareaRepository.java # Capa de acceso a datos
├── service/
│   ├── TareaService.java    # Lógica de negocio
│   ├── MensajeService.java  # Interfaz de mensajes
│   ├── MensajeDevService.java  # Implementación para desarrollo
│   └── MensajeProdService.java # Implementación para producción
└── FundamentosSpringApplication.java # Clase principal
```

## 🚀 Instrucciones para Clonar y Ejecutar

### Prerrequisitos

- Java 17 o superior instalado
- Maven 3.6+ (o usar el wrapper incluido)
- Git instalado

### Clonar el Repositorio

```bash
git clone [URL_DE_TU_REPOSITORIO]
cd fundamentos_spring
```

### Ejecutar en Modo Desarrollo (DEV)

```bash
# Con Maven Wrapper (recomendado)
./mvnw spring-boot:run

# O con Maven instalado
mvn spring-boot:run
```

Por defecto, el proyecto se ejecuta en modo **desarrollo** (profile `dev`).

### Ejecutar en Modo Producción (PROD)

```bash
# Con Maven Wrapper
./mvnw spring-boot:run -Dspring-boot.run.profiles=prod

# O con Maven instalado
mvn spring-boot:run -Dspring-boot.run.profiles=prod
```

### Compilar el Proyecto

```bash
./mvnw clean package
```

### Ejecutar el JAR generado

```bash
# Modo desarrollo
java -jar target/tareas-0.0.1-SNAPSHOT.jar

# Modo producción
java -jar -Dspring.profiles.active=prod target/tareas-0.0.1-SNAPSHOT.jar
```

## 🔧 Cómo Cambiar entre Profiles (dev/prod)

### Opción 1: Modificar application.properties

Edita el archivo `src/main/resources/application.properties`:

```properties
# Cambiar entre 'dev' y 'prod'
spring.profiles.active=dev
```

### Opción 2: Parámetro en línea de comandos

```bash
# Desarrollo
./mvnw spring-boot:run -Dspring-boot.run.profiles=dev

# Producción
./mvnw spring-boot:run -Dspring-boot.run.profiles=prod
```

### Opción 3: Variable de entorno

```bash
export SPRING_PROFILES_ACTIVE=prod
./mvnw spring-boot:run
```

## 🌐 Diferencias entre Entornos

### Entorno de Desarrollo (dev)

- ✅ Límite de tareas: 10
- ✅ Estadísticas habilitadas
- ✅ Logging nivel DEBUG
- ✅ Mensajes detallados y amigables
- ✅ Ideal para pruebas y experimentación

### Entorno de Producción (prod)

- ✅ Límite de tareas: 1000
- ✅ Estadísticas deshabilitadas
- ✅ Logging nivel ERROR
- ✅ Mensajes simples y concisos
- ✅ Optimizado para rendimiento

## 📸 Capturas de Pantalla

### Ejecución en Modo Desarrollo (DEV)

```
======================================================================
🚀  ¡BIENVENIDO AL ENTORNO DE DESARROLLO! 🚀
======================================================================
🔧 Estás en modo DESARROLLO
💡 Aquí puedes experimentar y probar sin restricciones
📝 Los logs son detallados para facilitar el debugging
======================================================================

⚙️  CONFIGURACIÓN ACTUAL:
   Nombre de la aplicación: Sistema de Gestión de Tareas
   Máximo de tareas: 10
   Mostrar estadísticas: true

📋 LISTADO DE TODAS LAS TAREAS INICIALES:
   ⏳ [ID: 1] 🔴 ALTA - Completar práctica de Spring Boot
   ⏳ [ID: 2] 🔴 ALTA - Estudiar inyección de dependencias
   ✅ [ID: 3] 🟡 MEDIA - Revisar documentación de profiles
   ⏳ [ID: 4] 🟡 MEDIA - Configurar properties en Spring
   ⏳ [ID: 5] 🟢 BAJA - Crear repositorio en GitHub

➕ AGREGANDO NUEVA TAREA...
   ✅ Tarea agregada: Documentar el proyecto con README profesional

⏳ TAREAS PENDIENTES:
   ⏳ [ID: 1] 🔴 ALTA - Completar práctica de Spring Boot
   ⏳ [ID: 2] 🔴 ALTA - Estudiar inyección de dependencias
   ⏳ [ID: 4] 🟡 MEDIA - Configurar properties en Spring
   ⏳ [ID: 5] 🟢 BAJA - Crear repositorio en GitHub
   ⏳ [ID: 6] 🔴 ALTA - Documentar el proyecto con README profesional

✓ MARCANDO TAREA #1 COMO COMPLETADA...
   ✅ Tarea marcada como completada exitosamente

📊 ESTADÍSTICAS:
   Total de tareas: 6
   ✅ Completadas: 2
   ⏳ Pendientes: 4

✅ TAREAS COMPLETADAS:
   ✅ [ID: 1] 🔴 ALTA - Completar práctica de Spring Boot
   ✅ [ID: 3] 🟡 MEDIA - Revisar documentación de profiles

======================================================================
👋  ¡HASTA PRONTO, DESARROLLADOR!
======================================================================
✨ Gracias por usar el Sistema de Gestión de Tareas
🐛 Recuerda: los bugs son características no documentadas 😄
📚 Sigue aprendiendo Spring Boot!

```

### Ejecución en Modo Desarrollo (DEV)

```
==================================================
Sistema de Gestion de Tareas - PRODUCCION
==================================================

CONFIGURACION ACTUAL:
   Nombre de la aplicacion: Sistema de Gestion de Tareas
   Maximo de tareas: 1000
   Mostrar estadisticas: false

LISTADO DE TODAS LAS TAREAS INICIALES:
   [ ] [ID: 1] [ALTA] Completar practica de Spring Boot
   [ ] [ID: 2] [ALTA] Estudiar inyeccion de dependencias
   [X] [ID: 3] [MEDIA] Revisar documentacion de profiles
   [ ] [ID: 4] [MEDIA] Configurar properties en Spring
   [ ] [ID: 5] [BAJA] Crear repositorio en GitHub


AGREGANDO NUEVA TAREA...
   Tarea agregada: Documentar el proyecto con README profesional

TAREAS PENDIENTES:
   [ ] [ID: 1] [ALTA] Completar practica de Spring Boot
   [ ] [ID: 2] [ALTA] Estudiar inyeccion de dependencias
   [ ] [ID: 4] [MEDIA] Configurar properties en Spring
   [ ] [ID: 5] [BAJA] Crear repositorio en GitHub
   [ ] [ID: 6] [ALTA] Documentar el proyecto con README profesional


MARCANDO TAREA #1 COMO COMPLETADA...
   Tarea marcada como completada exitosamente

TAREAS COMPLETADAS:
   [X] [ID: 1] [ALTA] Completar practica de Spring Boot
   [X] [ID: 3] [MEDIA] Revisar documentacion de profiles


==================================================
Aplicacion finalizada correctamente
==================================================
```