package com.informaticonfig.spring.demoactividaduno.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.informaticonfig.spring.demoactividaduno.models.dto.ParametroDTO;

@RestController 
@RequestMapping("/api/parametros")
public class RquestParamControllers {

    @GetMapping("/detalle")
    public ParametroDTO detalle(@RequestParam (required = false,
         defaultValue = "hola a todos  ") String informacion){
        ParametroDTO parametro1 = new ParametroDTO();
        parametro1.setInformacion(informacion);
        return parametro1;
    }
}
