# 🚀 Comandos Git para Subir el Proyecto

## Paso 1: Inicializar Git (si no está inicializado)

```bash
cd /home/maxi/Escritorio/Facu/Java/fundamentos_spring
git init
```

## Paso 2: Configurar Git (si es primera vez)

```bash
git config --global user.name "Tu Nombre Completo"
git config --global user.email "tu-email@ejemplo.com"
```

## Paso 3: Agregar todos los archivos

```bash
git add .
```

## Paso 4: Hacer el primer commit

### Opción A: Un solo commit con todo
```bash
git commit -m "feat: Sistema completo de gestion de tareas con Spring Boot

- Implementacion de modelo (Tarea y Prioridad)
- Repositorio con almacenamiento en memoria
- Servicio de logica de negocio con validaciones
- Configuracion con properties y profiles (dev/prod)
- CommandLineRunner con flujo completo de demostracion
- Beans condicionales segun entorno activo
- README profesional con documentacion completa
- Scripts de ejecucion para facilitar pruebas
- Instrucciones detalladas de entrega"
```

### Opción B: Commits separados (más profesional)

```bash
# Commit 1: Modelo
git add src/main/java/com/utn/tareas/model/
git commit -m "feat: Agregar modelo de dominio (Tarea y Prioridad)"

# Commit 2: Repositorio
git add src/main/java/com/utn/tareas/repository/
git commit -m "feat: Implementar repositorio con almacenamiento en memoria y generacion de IDs"

# Commit 3: Servicio
git add src/main/java/com/utn/tareas/service/TareaService.java
git commit -m "feat: Implementar servicio de logica de negocio con validaciones"

# Commit 4: Configuración
git add src/main/resources/
git commit -m "feat: Configurar properties y profiles para entornos dev y prod"

# Commit 5: Mensajes
git add src/main/java/com/utn/tareas/service/Mensaje*.java
git commit -m "feat: Implementar beans condicionales con profiles para mensajes"

# Commit 6: Aplicación principal
git add src/main/java/com/utn/tareas/FundamentosSpringApplication.java
git commit -m "feat: Implementar CommandLineRunner con flujo completo de demostracion"

# Commit 7: Documentación
git add README.md INSTRUCCIONES_ENTREGA.md RESUMEN_PROYECTO.md VERIFICACION_FINAL.md
git commit -m "docs: Agregar documentacion completa del proyecto"

# Commit 8: Scripts y configuración
git add .gitignore *.sh
git commit -m "chore: Agregar gitignore y scripts de ejecucion"

# Commit 9: Dependencias
git add pom.xml
git commit -m "build: Configurar dependencias Maven (Spring Boot, Lombok, DevTools)"
```

## Paso 5: Crear repositorio en GitHub

1. Ve a: https://github.com
2. Click en el botón verde "New" o "+" → "New repository"
3. Completa:
   - **Repository name**: `sistema-gestion-tareas-spring`
   - **Description**: `Sistema de gestion de tareas desarrollado con Spring Boot - Trabajo Practico UTN`
   - **Visibility**: Public (Público)
   - **NO** marcar: Initialize with README
   - **NO** marcar: Add .gitignore
   - **NO** marcar: Choose a license
4. Click en "Create repository"

## Paso 6: Conectar repositorio local con GitHub

GitHub te mostrará comandos, pero aquí están listos para copiar:

```bash
# Renombrar rama a main (si no lo está)
git branch -M main

# Agregar repositorio remoto (REEMPLAZA TU-USUARIO con tu usuario de GitHub)
git remote add origin https://github.com/TU-USUARIO/sistema-gestion-tareas-spring.git

# Verificar que se agregó correctamente
git remote -v
```

## Paso 7: Subir el código a GitHub

```bash
# Primera vez (crea la rama en GitHub)
git push -u origin main

# Subsecuentes veces (si haces cambios después)
git push
```

## Paso 8: Verificar en GitHub

1. Ve a: `https://github.com/TU-USUARIO/sistema-gestion-tareas-spring`
2. Verifica que todos los archivos estén presentes
3. Verifica que el README.md se muestre correctamente
4. Asegúrate que el repositorio sea público

## Paso 9: Copiar link para Moodle

El link será:
```
https://github.com/TU-USUARIO/sistema-gestion-tareas-spring
```

---

## 🔧 Comandos Útiles Adicionales

### Ver estado de los archivos
```bash
git status
```

### Ver historial de commits
```bash
git log --oneline
```

### Ver archivos que serán commiteados
```bash
git diff --cached
```

### Deshacer cambios en un archivo (antes de commit)
```bash
git checkout -- archivo.java
```

### Ver diferencias
```bash
git diff
```

---

## 🚨 Solución de Problemas Comunes

### Error: "fatal: remote origin already exists"
```bash
git remote remove origin
git remote add origin https://github.com/TU-USUARIO/sistema-gestion-tareas-spring.git
```

### Error: "src refspec main does not match any"
```bash
# Asegúrate de haber hecho al menos un commit
git add .
git commit -m "Initial commit"
git branch -M main
git push -u origin main
```

### Error: "Permission denied (publickey)"
Si usas SSH, cambia a HTTPS:
```bash
git remote set-url origin https://github.com/TU-USUARIO/sistema-gestion-tareas-spring.git
```

### Quiero cambiar el mensaje del último commit
```bash
git commit --amend -m "Nuevo mensaje"
```

### Olvidé agregar archivos al último commit
```bash
git add archivo-olvidado.java
git commit --amend --no-edit
```

---

## 📋 Checklist Final

Antes de entregar en Moodle, verifica:

- [ ] El repositorio es público
- [ ] Todos los archivos están subidos
- [ ] El README.md tiene tu nombre y legajo
- [ ] No subiste carpetas innecesarias (target/, .idea/)
- [ ] El link del repositorio funciona
- [ ] Los commits tienen mensajes descriptivos

---

## 🎯 Ejemplo de Link Final para Moodle

```
https://github.com/maximiliano-garcia/sistema-gestion-tareas-spring
```

Reemplaza `maximiliano-garcia` con tu usuario de GitHub.

---

## ✅ ¡Listo!

Tu proyecto está ahora en GitHub y listo para ser entregado en Moodle.

**¡Excelente trabajo!** 🎉

