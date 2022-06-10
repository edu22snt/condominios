package com.br.condominio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.condominio.entities.Company;

/**
 * @since 1.0.0
 */
public interface CompanyRepository extends JpaRepository<Company, Long> {

}
