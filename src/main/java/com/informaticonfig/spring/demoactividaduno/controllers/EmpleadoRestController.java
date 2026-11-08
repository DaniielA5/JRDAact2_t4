package com.informaticonfig.spring.demoactividaduno.controllers;

import java.net.URI;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.informaticonfig.spring.demoactividaduno.models.dto.EmpleadoDTO;
import com.informaticonfig.spring.demoactividaduno.services.EmpleadoService;

@RestController 
@RequestMapping("/api/empleados")
public class EmpleadoRestController {
    
    private final EmpleadoService empleadoService;

    public EmpleadoRestController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @GetMapping
    public List<EmpleadoDTO> listar(@RequestParam(required = false) String puesto) {
        return empleadoService.listar(puesto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpleadoDTO> obtener(@PathVariable int id) {
        return ResponseEntity.of(empleadoService.buscarPorId(id));
    }

     @PostMapping
    public ResponseEntity<?> crear(@RequestBody EmpleadoDTO empleado) {
        if (empleado.getNombre() == null || empleado.getNombre().isBlank()
                || empleado.getPuesto() == null || empleado.getPuesto().isBlank()) {
            return ResponseEntity.badRequest()
                    .body(Map.of("error", "Nombre y puesto son obligatorios"));
        }

        EmpleadoDTO creado = empleadoService.crear(empleado);
        return ResponseEntity
                .created(URI.create("/api/empleados/" + creado.getId()))
                .body(creado);
    }
    
}
