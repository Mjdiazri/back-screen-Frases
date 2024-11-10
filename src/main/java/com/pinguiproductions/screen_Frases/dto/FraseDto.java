package com.pinguiproductions.screen_Frases.dto;

import jakarta.persistence.Column;

public record FraseDto(
        String titulo,
        String frase,
        String personaje,
        String poster ){
}
