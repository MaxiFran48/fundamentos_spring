#!/bin/bash

echo "=========================================="
echo "Ejecutando en modo DESARROLLO (DEV)"
echo "=========================================="
./mvnw spring-boot:run

echo ""
echo "=========================================="
echo "Presiona Enter para continuar..."
read

echo "=========================================="
echo "Ejecutando en modo PRODUCCION (PROD)"
echo "=========================================="
./mvnw spring-boot:run -Dspring-boot.run.profiles=prod

