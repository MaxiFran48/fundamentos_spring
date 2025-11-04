package com.utn.tareas.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class MensajeProdService implements MensajeService {

    @Override
    public void mostrarBienvenida() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Sistema de Gestion de Tareas - PRODUCCION");
        System.out.println("=".repeat(50) + "\n");
    }

    @Override
    public void mostrarDespedida() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Aplicacion finalizada correctamente");
        System.out.println("=".repeat(50) + "\n");
    }
}

