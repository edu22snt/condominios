package com.br.condominio.entities;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * @since 1.0.0
 */
@Data
@ToString
@Entity
@Table(name = "account")
public class Account implements Serializable {

    @Id
    @Column(name = "ID_ACCOUNT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_COMPANY")
    private Company company;

    @NotNull
    @Size(max = 45)
    @Column(name = "ACCOUNT_CONTACT_NAME", length = 45, nullable = false)
    private String contactName;

    @NotNull
    @Size(max = 45)
    @Column(name = "ACCOUNT_EMAIL", length = 45, nullable = false)
    private String email;

    @NotNull
    @Size(max = 45)
    @Column(name = "ACCOUNT_PHONE_NUMBER", length = 45, nullable = false)
    private String phoneNumber;

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "account_destination",
            joinColumns = @JoinColumn(name = "ID_ACCOUNT"),
            inverseJoinColumns = @JoinColumn(name = "ID_DESTINATION"))
    private Set<Destination> destinations;
    
    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "account")
    private List<User> users;
}
