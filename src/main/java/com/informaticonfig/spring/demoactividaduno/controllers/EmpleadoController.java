package com.informaticonfig.spring.demoactividaduno.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;
import com.informaticonfig.spring.demoactividaduno.models.dto.EmpleadoDTO;
import com.informaticonfig.spring.demoactividaduno.services.EmpleadoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller 
@RequestMapping("/empleados")
public class EmpleadoController {
    private final EmpleadoService empleadoService;

    @Value("${app.autor}")
    private String autor;

    @Value("${app.proyecto}")
    private String proyecto;

    public EmpleadoController(EmpleadoService empleadoService) { 
        this.empleadoService = empleadoService;
    }

    @ModelAttribute 
    public void datosGenerales(Model model) {
        model.addAttribute("autor", autor);
        model.addAttribute("proyecto", proyecto);
    }

    @GetMapping
    public String lista(@RequestParam(required = false) String puesto, Model model)  {
        model.addAttribute("empleados", empleadoService.listar(puesto));
        model.addAttribute("puestos", empleadoService.puesto());
        model.addAttribute("puestoActual", puesto);
        
        return "empleados/lista";
    }
    
       @GetMapping("/{id}")
    public String detalle(@PathVariable int id, Model model) {
        Optional<EmpleadoDTO> empleado = empleadoService.buscarPorId(id);
        if (empleado.isEmpty()) {
            return "redirect:/empleados";
        }
        model.addAttribute("empleado", empleado.get());
        return "empleados/detalle";
    }

}
