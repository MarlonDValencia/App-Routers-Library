package com.co.app.libreriareactive.usesCases;

import com.co.app.libreriareactive.DTOs.RecursoDTO;
import reactor.core.publisher.Flux;

public interface ObtenerPorString {
    Flux<RecursoDTO> get(String string);
}
