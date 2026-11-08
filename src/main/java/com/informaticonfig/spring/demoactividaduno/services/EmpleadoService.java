package com.informaticonfig.spring.demoactividaduno.services;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.informaticonfig.spring.demoactividaduno.models.Empleados;
import com.informaticonfig.spring.demoactividaduno.models.dto.EmpleadoDTO;

@Service 
public class EmpleadoService {
    
    private final List<Empleados> empleados = new CopyOnWriteArrayList<>();
    private final AtomicInteger siguienteId = new AtomicInteger(1);

    public EmpleadoService() {
        guardar(new Empleados("Maria", "Perez", "calle primera no1", "Secretaria", 20, 123456789, 0));
        guardar(new Empleados("juan", "Reyez", "calle primera no2", "Gerente", 40, 123456546, 0));
        guardar(new Empleados("Mateo", "Gonzales", "calle primera no3", "Contador",35, 123424656, 0));
        guardar(new Empleados("Jesus", "Bautista", "calle primera no4", "Disenador", 28, 123451234, 0));
        guardar(new Empleados("Santiago", "Armesilla", "calle primera no5", "Analista", 29, 12349874, 0));
        guardar(new Empleados("Carina", "quintanilla", "calle primera no6", "Subgerente", 36, 123486424, 0));


    }

    public List<EmpleadoDTO> listar(String puesto) {
        return empleados.stream().filter(e -> puesto == null || puesto.isBlank() || e.getPuesto().trim().equalsIgnoreCase(puesto.trim())).map(this::aDTO).toList();
    }

    public Optional<EmpleadoDTO> buscarPorId(int id) {
        return empleados.stream().filter(e -> e.getId() == id).findFirst().map(this::aDTO);
    }

    public List<String> puesto () {
        return empleados.stream().map(Empleados::getPuesto).distinct().sorted().toList();

    }

    public EmpleadoDTO crear(EmpleadoDTO dto) {
        int edad = dto.getEdad() != null ? dto.getEdad() : 0;
        Empleados nuevo = new Empleados(limpio(dto.getNombre()), limpio(dto.getApellido()), "Sin dirección",
                limpio(dto.getPuesto()), edad, 0, 0);
        return guardar(nuevo);
    }

    private String limpio(String texto) {
        return texto == null ? "" : texto.trim();
    }

    private EmpleadoDTO guardar(Empleados e) {
        e.setId(siguienteId.getAndIncrement());
        empleados.add(e);
        return aDTO(e);
    }

    private EmpleadoDTO aDTO(Empleados e) {
        return new EmpleadoDTO(e.getId(), e.getNombre(), e.getApellido(), e.getPuesto(), e.getEdad());
    }
}
