package com.br.condominio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.condominio.entities.Role;
import com.br.condominio.services.RoleService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/roles")
@PreAuthorize("hasRole('ADMIN')")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping()
    public List<Role> findAll() {
        return roleService.findAll();
    }
}
