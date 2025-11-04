package com.utn.tareas;

import com.utn.tareas.model.Prioridad;
import com.utn.tareas.model.Tarea;
import com.utn.tareas.service.MensajeService;
import com.utn.tareas.service.TareaService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class FundamentosSpringApplication implements CommandLineRunner {

    private final TareaService tareaService;
    private final MensajeService mensajeService;

    public FundamentosSpringApplication(TareaService tareaService, MensajeService mensajeService) {
        this.tareaService = tareaService;
        this.mensajeService = mensajeService;
    }

    public static void main(String[] args) {
        SpringApplication.run(FundamentosSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // 1. Mostrar mensaje de bienvenida
        mensajeService.mostrarBienvenida();

        // 2. Mostrar la configuracion actual
        tareaService.mostrarConfiguracion();

        // 3. Listar todas las tareas iniciales
        System.out.println("LISTADO DE TODAS LAS TAREAS INICIALES:");
        imprimirTareas(tareaService.listarTodas());

        // 4. Agregar una nueva tarea
        System.out.println("\nAGREGANDO NUEVA TAREA...");
        Tarea nuevaTarea = tareaService.agregarTarea(
            "Documentar el proyecto con README profesional",
            Prioridad.ALTA
        );
        System.out.println("   Tarea agregada: " + nuevaTarea.getDescripcion());
        System.out.println();

        // 5. Listar tareas pendientes
        System.out.println("TAREAS PENDIENTES:");
        imprimirTareas(tareaService.listarPendientes());

        // 6. Marcar una tarea como completada
        System.out.println("\nMARCANDO TAREA #1 COMO COMPLETADA...");
        boolean marcada = tareaService.marcarComoCompletada(1L);
        if (marcada) {
            System.out.println("   Tarea marcada como completada exitosamente");
        }
        System.out.println();

        // 7. Mostrar estadisticas (si esta habilitado en la configuracion)
        if (tareaService.isMostrarEstadisticas()) {
            System.out.println(tareaService.obtenerEstadisticas());
            System.out.println();
        }

        // 8. Listar tareas completadas
        System.out.println("TAREAS COMPLETADAS:");
        imprimirTareas(tareaService.listarCompletadas());

        // 9. Mostrar mensaje de despedida
        mensajeService.mostrarDespedida();
    }

    private void imprimirTareas(List<Tarea> tareas) {
        if (tareas.isEmpty()) {
            System.out.println("   (No hay tareas)");
        } else {
            tareas.forEach(tarea -> {
                String estado = tarea.isCompletada() ? "[X]" : "[ ]";
                System.out.printf("   %s [ID: %d] [%s] %s%n",
                    estado,
                    tarea.getId(),
                    tarea.getPrioridad(),
                    tarea.getDescripcion()
                );
            });
        }
        System.out.println();
    }
}

