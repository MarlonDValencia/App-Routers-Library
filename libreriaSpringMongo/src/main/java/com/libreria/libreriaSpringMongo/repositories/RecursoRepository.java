package com.libreria.libreriaSpringMongo.repositories;

import com.libreria.libreriaSpringMongo.collections.Recurso; 
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface  RecursoRepository extends ReactiveMongoRepository<Recurso, String> {
    Recurso findByName(String name);
}
