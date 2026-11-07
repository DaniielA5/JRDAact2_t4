package com.informaticonfig.spring.demoactividaduno.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.informaticonfig.spring.demoactividaduno.models.Empleados;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
 

@RestController 
@RequestMapping("/api")

public class EjemploRestController {
    @GetMapping (path = "/ejemploRest")

    public Map<String, Object> ejemploRest() {
        Empleados empleado1 = new Empleados("juan", "Santiago", "Guadalajara centro 123", "Gerente",
                                                35, 123423434, 001 );

        Map<String, Object> respuesta =  new HashMap<>();
        respuesta.put("Empleado","Datos empleado");
        respuesta.put("Informacion",empleado1);
        return respuesta;
    }
    
}
