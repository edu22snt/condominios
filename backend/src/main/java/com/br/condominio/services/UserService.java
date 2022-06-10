package com.br.condominio.services;

import com.br.condominio.entities.User;
import com.br.condominio.framework.AbstractService;
import com.br.condominio.repositories.UserRepository;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @since 1.0.0
 */
@Service
public class UserService extends AbstractService<UserRepository, User, Long> {

    private final PasswordEncoder encoder;

    public UserService(PasswordEncoder encoder, UserRepository userRepository) {
        super(userRepository);
        this.encoder = encoder;
    }

    @Override
    public User save(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return repository.save(user);
    }
}
