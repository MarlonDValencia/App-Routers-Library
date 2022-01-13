package com.co.app.libreriareactive.usesCases.recurso;

import com.co.app.libreriareactive.DTOs.RecursoDTO;
import com.co.app.libreriareactive.mappers.RecursoMapper;
import com.co.app.libreriareactive.repositories.RepositorioRecurso;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class UseCaseBuscarPorId implements BuscarRecurso{
    private final RepositorioRecurso repositorio;
    private final RecursoMapper mapper;

    public UseCaseBuscarPorId(RepositorioRecurso repositorioRecurso, RecursoMapper recursoMapper) {
        this.repositorio = repositorioRecurso;
        this.mapper = recursoMapper;
    }

    @Override
    public Mono<RecursoDTO> findById(String id) {
        return repositorio.findById(id).map(mapper.mapRecursoToDTO());
    }

}
