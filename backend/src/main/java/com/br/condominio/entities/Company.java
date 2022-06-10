package com.br.condominio.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @since 1.0.0
 */
@Data
@Entity
@Table(name = "company")
public class Company implements Serializable {

    @Id
    @Column(name = "ID_COMPANY")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 45)
    @Column(name = "COMPANY_NAME", length = 45, nullable = false)
    private String name;

    @NotNull
    @Size(max = 60)
    @Column(name = "COMPANY_ADDRESS", length = 60, nullable = false)
    private String address;

    @NotNull
    @Column(name = "DATE_REGISTERED")
    private LocalDateTime dateRegistered;

    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "company")
    private List<Account> accounts;

}
