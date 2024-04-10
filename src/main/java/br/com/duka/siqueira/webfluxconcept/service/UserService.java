package br.com.duka.siqueira.webfluxconcept.service;

import br.com.duka.siqueira.webfluxconcept.entity.User;
import br.com.duka.siqueira.webfluxconcept.mapper.UserMapper;
import br.com.duka.siqueira.webfluxconcept.model.request.UserRequest;
import br.com.duka.siqueira.webfluxconcept.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final UserMapper mapper;

    public Mono<User> save(final UserRequest request) {
        return repository.save(mapper.toEntity(request));
    }

    public Mono<User> findById(final String id) {
        return repository.findById(id);
    }
}
