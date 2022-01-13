package com.co.app.libreriareactive.usesCases.recurso;

import com.co.app.libreriareactive.mappers.RecursoMapper;
import com.co.app.libreriareactive.repositories.RepositorioRecurso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class UseCaseBorrar implements BorrarRecurso {
    private final RepositorioRecurso repositorio;
    private final RecursoMapper mapper;

    @Autowired
    public UseCaseBorrar(RecursoMapper mapper, RepositorioRecurso repositorio) {
        this.repositorio = repositorio;
        this.mapper = mapper;
    }


    @Override
    public Mono<Void> deleteById(String id) {
        return repositorio.deleteById(id);
    }
}