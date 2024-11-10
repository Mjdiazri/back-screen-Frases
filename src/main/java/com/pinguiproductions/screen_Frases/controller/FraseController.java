package com.pinguiproductions.screen_Frases.controller;

import com.pinguiproductions.screen_Frases.dto.FraseDto;
import com.pinguiproductions.screen_Frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    FraseService servicio;

    @GetMapping("/series/frases")
    public FraseDto obtenerFraseAleatoria(){
        return servicio.obtenerFraseAleatoria();
    }

}
