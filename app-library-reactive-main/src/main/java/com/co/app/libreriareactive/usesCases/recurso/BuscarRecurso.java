package com.co.app.libreriareactive.usesCases.recurso;

import com.co.app.libreriareactive.DTOs.RecursoDTO;
import reactor.core.publisher.Mono;

@FunctionalInterface
public interface BuscarRecurso {
    Mono<RecursoDTO> findById(String id);
}