package com.br.condominio.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString;

/**
 * @since 1.0.0
 */
@Data
@ToString
@Entity
@Table(name = "destination")
public class Destination implements Serializable {

    @Id
    @Column(name="ID_DESTINATION")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    
    @NotNull
    @Size(max=45)
    @Column(name="COUNTRY_CODE", length = 45, nullable = false)
    private String countryCode;

    @JsonIgnore
    @ManyToMany(mappedBy = "destinations")
    private Set<Account> accounts;
}
