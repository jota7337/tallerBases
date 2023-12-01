package com.unbosque.primerospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManjeoController {

    @GetMapping("/inicio")
    public String inicioPagina(){
         return "inicio";
    }

    @GetMapping("/RegistroFactura")
    public String Registrar(){
        return "RegistrarFactura";
    }

    @GetMapping("/MostrarFactura")
    public String Mostrar(){
        return "Factura";
    }

    @GetMapping("/login")
    public String login(){
        return "index";
    }


}
