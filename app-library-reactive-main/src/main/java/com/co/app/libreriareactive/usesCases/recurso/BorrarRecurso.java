package com.co.app.libreriareactive.usesCases.recurso;

import reactor.core.publisher.Mono;

@FunctionalInterface
public interface BorrarRecurso {
    Mono<Void> deleteById(String id);
}
