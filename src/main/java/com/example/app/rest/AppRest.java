package com.example.app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRest {

    @GetMapping ("/nombre")
    public String nombreSitio (){
        return "Inicio del sitio";
    }

    @GetMapping ("/descripcion")
    public String descripcionSitio (){
        return "Ejemplo sobre API REST con Spring y Angular";
    }

}
