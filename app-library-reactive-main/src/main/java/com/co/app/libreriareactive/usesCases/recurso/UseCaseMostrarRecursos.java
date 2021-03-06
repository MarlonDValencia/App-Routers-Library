package com.co.app.libreriareactive.usesCases.recurso;

import com.co.app.libreriareactive.DTOs.RecursoDTO;
import com.co.app.libreriareactive.mappers.RecursoMapper;
import com.co.app.libreriareactive.repositories.RepositorioRecurso;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Flux;

import java.util.function.Supplier;

@Service
@Validated
public class UseCaseMostrarRecursos implements Supplier<Flux<RecursoDTO>> {

    private final RepositorioRecurso repositorio;
    private final RecursoMapper mapper;

    public UseCaseMostrarRecursos(RecursoMapper mapper, RepositorioRecurso repositorio) {
        this.repositorio = repositorio;
        this.mapper = mapper;
    }

    @Override
    public Flux<RecursoDTO> get() {
        return repositorio.findAll().map(mapper.mapRecursoToDTO());
    }
}
