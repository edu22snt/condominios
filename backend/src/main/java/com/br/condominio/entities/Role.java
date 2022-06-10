package com.br.condominio.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "user_role")
public class Role {

    @Id
    @Column(name = "id_user_role")
    private Integer id;

    @Column(name = "user_role_code", nullable = false)
    private String code;

    @Column(name = "user_role_description", nullable = false)
    private String description;
    
    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "role")
    private List<User> users;
}
