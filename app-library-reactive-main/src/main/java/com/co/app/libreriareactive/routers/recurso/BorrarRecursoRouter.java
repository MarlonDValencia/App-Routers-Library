package com.co.app.libreriareactive.routers.recurso;

import com.co.app.libreriareactive.DTOs.RecursoDTO;
import com.co.app.libreriareactive.usesCases.recurso.UseCaseBorrar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.DELETE;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class BorrarRecursoRouter {
    @Bean
    public RouterFunction<ServerResponse> borrarRecurso(UseCaseBorrar useCaseBorrar) {
        return route(DELETE("/recursos/borrar/{id}").and(accept(MediaType.APPLICATION_JSON)),
                request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(useCaseBorrar.deleteById(request.pathVariable("id")), RecursoDTO.class)
        );
    }
}