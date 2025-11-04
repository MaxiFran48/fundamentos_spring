package com.utn.tareas.repository;

import com.utn.tareas.model.Prioridad;
import com.utn.tareas.model.Tarea;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class TareaRepository {

    private final List<Tarea> tareas;
    private final AtomicLong idGenerator;

    public TareaRepository() {
        this.tareas = new ArrayList<>();
        this.idGenerator = new AtomicLong(1);

        tareas.add(new Tarea(idGenerator.getAndIncrement(), "Completar practica de Spring Boot", false, Prioridad.ALTA));
        tareas.add(new Tarea(idGenerator.getAndIncrement(), "Estudiar inyeccion de dependencias", false, Prioridad.ALTA));
        tareas.add(new Tarea(idGenerator.getAndIncrement(), "Revisar documentacion de profiles", true, Prioridad.MEDIA));
        tareas.add(new Tarea(idGenerator.getAndIncrement(), "Configurar properties en Spring", false, Prioridad.MEDIA));
        tareas.add(new Tarea(idGenerator.getAndIncrement(), "Crear repositorio en GitHub", false, Prioridad.BAJA));
    }

    public Tarea guardar(Tarea tarea) {
        if (tarea.getId() == null) {
            tarea.setId(idGenerator.getAndIncrement());
        }
        tareas.add(tarea);
        return tarea;
    }

    public List<Tarea> obtenerTodas() {
        return new ArrayList<>(tareas);
    }

    public Optional<Tarea> buscarPorId(Long id) {
        return tareas.stream()
                .filter(tarea -> tarea.getId().equals(id))
                .findFirst();
    }

    public boolean eliminarPorId(Long id) {
        return tareas.removeIf(tarea -> tarea.getId().equals(id));
    }
}

