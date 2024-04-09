package br.com.duka.siqueira.webfluxconcept.model.response;

public record UserResponse(
        String id,
        String name,
        String email,
        String password
) {
}
