package com.br.condominio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.condominio.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
