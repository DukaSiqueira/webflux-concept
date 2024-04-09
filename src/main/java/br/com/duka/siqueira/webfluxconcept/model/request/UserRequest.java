package br.com.duka.siqueira.webfluxconcept.model.request;

public record UserRequest(
        String name,
        String email,
        String password
) {
}
