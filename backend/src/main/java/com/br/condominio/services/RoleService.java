package com.br.condominio.services;

import com.br.condominio.entities.Role;
import com.br.condominio.framework.AbstractService;
import com.br.condominio.repositories.RoleRepository;

import org.springframework.stereotype.Service;

@Service
public class RoleService extends AbstractService<RoleRepository, Role, Integer> {

    public RoleService(RoleRepository repository) {
        super(repository);
    }
}
