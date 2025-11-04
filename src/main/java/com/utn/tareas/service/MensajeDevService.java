package com.utn.tareas.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class MensajeDevService implements MensajeService {

    @Override
    public void mostrarBienvenida() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println("BIENVENIDO AL ENTORNO DE DESARROLLO");
        System.out.println("=".repeat(70));
        System.out.println("Estas en modo DESARROLLO");
        System.out.println("Aqui puedes experimentar y probar sin restricciones");
        System.out.println("Los logs son detallados para facilitar el debugging");
        System.out.println("=".repeat(70) + "\n");
    }

    @Override
    public void mostrarDespedida() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println("HASTA PRONTO, DESARROLLADOR!");
        System.out.println("=".repeat(70));
        System.out.println("Gracias por usar el Sistema de Gestion de Tareas");
        System.out.println("Recuerda: los bugs son caracteristicas no documentadas");
        System.out.println("Sigue aprendiendo Spring Boot!");
        System.out.println("=".repeat(70) + "\n");
    }
}

