package br.com.duka.siqueira.webfluxconcept.model.request;


import br.com.duka.siqueira.webfluxconcept.validator.TrimString;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserRequest(
        @TrimString
        @Size(min = 3, max = 50, message = "must be between 3 and 50 characters")
        @NotBlank(message = "must not be null or empty")
        String name,

        @TrimString
        @Email(message = "invalid e-mail")
        @NotBlank(message = "must not be null or empty")
        String email,

        @TrimString
        @Size(min = 8, max = 20, message = "must be between 8 and 20 characters")
        @NotBlank(message = "must not be null or empty")
        String password
) {
}
