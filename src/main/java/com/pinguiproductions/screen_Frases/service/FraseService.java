package com.pinguiproductions.screen_Frases.service;

import com.pinguiproductions.screen_Frases.dto.FraseDto;
import com.pinguiproductions.screen_Frases.modelos.Frase;
import com.pinguiproductions.screen_Frases.respository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;

    public FraseDto obtenerFraseAleatoria() {
        Frase frase = repository.obtenerFraseAleatoria();
        return new FraseDto(frase.getTitulo(),frase.getFrase(), frase.getPersonaje(), frase.getPoster());
    }



}
