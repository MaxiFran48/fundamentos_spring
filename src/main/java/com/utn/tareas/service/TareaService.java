package com.utn.tareas.service;

import com.utn.tareas.model.Prioridad;
import com.utn.tareas.model.Tarea;
import com.utn.tareas.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TareaService {

    private final TareaRepository tareaRepository;

    @Value("${app.nombre}")
    private String nombreApp;

    @Value("${app.max-tareas}")
    private int maxTareas;

    @Value("${app.mostrar-estadisticas}")
    private boolean mostrarEstadisticas;

    public TareaService(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    public Tarea agregarTarea(String descripcion, Prioridad prioridad) {
        List<Tarea> tareas = tareaRepository.obtenerTodas();

        if (tareas.size() >= maxTareas) {
            throw new IllegalStateException(
                String.format("No se pueden agregar mas tareas. Limite maximo: %d", maxTareas)
            );
        }

        Tarea nuevaTarea = new Tarea();
        nuevaTarea.setDescripcion(descripcion);
        nuevaTarea.setPrioridad(prioridad);
        nuevaTarea.setCompletada(false);

        return tareaRepository.guardar(nuevaTarea);
    }

    public List<Tarea> listarTodas() {
        return tareaRepository.obtenerTodas();
    }

    public List<Tarea> listarPendientes() {
        return tareaRepository.obtenerTodas().stream()
                .filter(tarea -> !tarea.isCompletada())
                .collect(Collectors.toList());
    }

    public List<Tarea> listarCompletadas() {
        return tareaRepository.obtenerTodas().stream()
                .filter(Tarea::isCompletada)
                .collect(Collectors.toList());
    }

    public boolean marcarComoCompletada(Long id) {
        return tareaRepository.buscarPorId(id)
                .map(tarea -> {
                    tarea.setCompletada(true);
                    return true;
                })
                .orElse(false);
    }

    public String obtenerEstadisticas() {
        List<Tarea> todasLasTareas = tareaRepository.obtenerTodas();
        long total = todasLasTareas.size();
        long completadas = todasLasTareas.stream().filter(Tarea::isCompletada).count();
        long pendientes = total - completadas;

        return String.format(
            "ESTADISTICAS:\n" +
            "   Total de tareas: %d\n" +
            "   Completadas: %d\n" +
            "   Pendientes: %d",
            total, completadas, pendientes
        );
    }

    public void mostrarConfiguracion() {
        System.out.println("CONFIGURACION ACTUAL:");
        System.out.println("   Nombre de la aplicacion: " + nombreApp);
        System.out.println("   Maximo de tareas: " + maxTareas);
        System.out.println("   Mostrar estadisticas: " + mostrarEstadisticas);
        System.out.println();
    }

    public boolean isMostrarEstadisticas() {
        return mostrarEstadisticas;
    }
}

