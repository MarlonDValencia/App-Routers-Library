package com.co.app.libreriareactive.usesCases.recurso;

import com.co.app.libreriareactive.DTOs.RecursoDTO;
import reactor.core.publisher.Mono;

@FunctionalInterface
public interface GuardarRecurso {
    public Mono<RecursoDTO> apply(RecursoDTO recursoDTO);
}