package com.informaticonfig.spring.demoactividaduno.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MateriasController {

    @GetMapping("/materias")
    public List<String> materias() {
        return List.of(
            "Conmutación y Enrutamiento de Redes de Datos",
            "Software para Toma de Decisiones",
            "Programación Web",
            "Gestión de Proyectos de Software",
            "Programación Lógica y Funcional",
            "Sistemas Programables",
            "Lenguajes y Autómatas II"
        );
    }

    @GetMapping("/materias/total")
    public int totalMaterias() {
        return materias().size();
    }
}