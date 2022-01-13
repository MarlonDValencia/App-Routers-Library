package com.co.app.libreriareactive.usesCases.tipo;

import com.co.app.libreriareactive.DTOs.RecursoDTO;
import com.co.app.libreriareactive.mappers.RecursoMapper;
import com.co.app.libreriareactive.repositories.RepositorioRecurso;
import com.co.app.libreriareactive.usesCases.ObtenerPorString;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Flux;

@Service
@Validated
public class UseCaseBuscarPorTipo implements ObtenerPorString {
    private final RepositorioRecurso repositorio;
    private final RecursoMapper mapper;

    public UseCaseBuscarPorTipo(RepositorioRecurso repositorio, RecursoMapper mapper) {
        this.repositorio = repositorio;
        this.mapper = mapper;
    }

    @Override
    public Flux<RecursoDTO> get(String tipo) {
        return repositorio.findByTipo(tipo).map(mapper.mapRecursoToDTO());
    }
}
