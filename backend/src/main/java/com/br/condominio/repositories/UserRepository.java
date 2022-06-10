package com.br.condominio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.condominio.entities.User;

import java.util.Optional;

/**
 * @since 1.0.0
 */
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findOneByEmail(String email);
}
