package com.informaticonfig.spring.demoactividaduno.controllers;

import org.springframework.web.bind.annotation.RestController;
import com.informaticonfig.spring.demoactividaduno.models.dto.ClaseDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
 

@RestController 
@RequestMapping("/api")

public class EjemploRestController {
    @GetMapping (path = "/ejemploRest")

    public ClaseDTO ejemploRest() {
        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("Informaticconfig");

        return usuario1;
    }
    
}


/*
Empleados empleado1 = new Empleados("juan", "Santiago", "Guadalajara centro 123", "Gerente",
                                                35, 123423434, 001 );

        Map<String, Object> respuesta =  new HashMap<>();
        respuesta.put("Empleado","Datos empleado");
        respuesta.put("Informacion",empleado1);
*/