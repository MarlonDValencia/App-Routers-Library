package com.co.app.libreriareactive.routers.area;

import com.co.app.libreriareactive.DTOs.RecursoDTO;
import com.co.app.libreriareactive.usesCases.area.UseCaseBuscarPorArea;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class BuscarPorAreaRouter {
    @Bean
    public RouterFunction<ServerResponse> buscarPorArea(UseCaseBuscarPorArea useCase) {
        return route(
                GET("/recursos/filtrarArea/{area}").and(accept(MediaType.APPLICATION_JSON)),
                request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(useCase.get(request.pathVariable("area")), RecursoDTO.class))
        );
    }
}