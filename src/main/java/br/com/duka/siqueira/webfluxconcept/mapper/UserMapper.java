package br.com.duka.siqueira.webfluxconcept.mapper;

import br.com.duka.siqueira.webfluxconcept.entity.User;
import br.com.duka.siqueira.webfluxconcept.model.request.UserRequest;
import br.com.duka.siqueira.webfluxconcept.model.response.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = IGNORE,
        nullValueCheckStrategy = ALWAYS
)
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    User toEntity(final UserRequest request);

    UserResponse toResponse(final User entity);
}
