#!/bin/bash

# Script para ejecutar el proyecto en modo PRODUCCION

echo "========================================"
echo "  EJECUTANDO EN MODO PRODUCCION (PROD)"
echo "========================================"
echo ""

./mvnw spring-boot:run -Dspring-boot.run.profiles=prod

echo ""
echo "Aplicacion finalizada."
#!/bin/bash

# Script para ejecutar el proyecto en modo DESARROLLO

echo "========================================"
echo "  EJECUTANDO EN MODO DESARROLLO (DEV)"
echo "========================================"
echo ""

./mvnw spring-boot:run

echo ""
echo "Aplicacion finalizada."

