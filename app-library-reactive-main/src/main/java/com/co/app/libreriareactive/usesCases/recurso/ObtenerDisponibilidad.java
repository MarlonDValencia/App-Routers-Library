package com.co.app.libreriareactive.usesCases.recurso;

import reactor.core.publisher.Mono;

public interface ObtenerDisponibilidad {
    Mono<String> get(String id);
}