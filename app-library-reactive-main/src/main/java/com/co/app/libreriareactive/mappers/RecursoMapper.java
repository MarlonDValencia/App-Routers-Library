package com.co.app.libreriareactive.mappers;

import com.co.app.libreriareactive.DTOs.RecursoDTO;
import com.co.app.libreriareactive.collection.Recurso;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

@Component
public class RecursoMapper {

    public Function<RecursoDTO, Recurso> mapperToRecurso() {
        return updateRecurso -> {
            var recurso = new Recurso();
            recurso.setId(updateRecurso.getId());
            recurso.setArea(updateRecurso.getArea());
            recurso.setDisponible(updateRecurso.isDisponible());
            recurso.setNombre(updateRecurso.getNombre());
            recurso.setTipo(updateRecurso.getTipo());
            return recurso;
        };
    }


    public Function<Recurso, RecursoDTO> mapRecursoToDTO() {
        return entity -> new RecursoDTO(
                entity.getId(),
                entity.getTipo(),
                entity.isDisponible(),
                entity.getArea(),
                entity.getNombre()
        );
    }

    public Recurso fromDTO(RecursoDTO dto){
        Recurso recurso = new Recurso();
        recurso.setId(dto.getId());
        recurso.setArea(dto.getArea());
        recurso.setDisponible(dto.isDisponible());
        recurso.setNombre(dto.getNombre());
        recurso.setTipo(dto.getTipo());
        return recurso;
    }

    public RecursoDTO fromCollection(Recurso collection){
        RecursoDTO recursoDTO = new RecursoDTO();
        recursoDTO.setId(collection.getId());
        recursoDTO.setArea(collection.getArea());
        recursoDTO.setDisponible(collection.isDisponible());
        recursoDTO.setNombre(collection.getNombre());
        recursoDTO.setTipo(collection.getTipo());
        return recursoDTO;
    }

    public List<RecursoDTO> fromCollectionList(List<Recurso> collection){
        if(collection==null){
            return null;
        }
        List<RecursoDTO> list = new ArrayList<>(collection.size());
        Iterator listTrack = collection.iterator();

        while(listTrack.hasNext()){
            Recurso recurso = (Recurso) listTrack.next();
            list.add(fromCollection(recurso));
        }
        return list;
    }
}
