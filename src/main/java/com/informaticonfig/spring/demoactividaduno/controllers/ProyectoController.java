package com.informaticonfig.spring.demoactividaduno.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProyectoController {

    @GetMapping("/proyecto")
    public String info(Map<String, Object> modelo) {
        modelo.put("Nombre", "Daniel Juarez");
        modelo.put("Servidor", "JRDAact1_t4");
        modelo.put("Materia", "Programación Web");

        return "proyecto";
    }
}