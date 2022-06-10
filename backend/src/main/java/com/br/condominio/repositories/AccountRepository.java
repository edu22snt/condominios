package com.br.condominio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.condominio.entities.Account;

/**
 * @since 1.0.0
 */
public interface AccountRepository extends JpaRepository<Account, Long> {

}
