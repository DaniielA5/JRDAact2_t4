package com.informaticonfig.spring.demoactividaduno.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.informaticonfig.spring.demoactividaduno.models.Empleados;

@Controller 
public class EjemploController {
    @GetMapping("detalles_info")
    public String info(Model model){
        Empleados empleado1 = new Empleados("juan", "Santiago", "Guadalajara centro 123", "Gerente",
                                                35, 123423434, 001 );

        model.addAttribute("Empleado", empleado1);
        return "proyecto";
    }
    
}
