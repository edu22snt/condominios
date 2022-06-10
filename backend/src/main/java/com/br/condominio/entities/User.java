package com.br.condominio.entities;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @since 1.0.0
 */
@Data
@ToString
@Entity
@Table(name = "operation_user")
public class User implements Serializable {

    @Id
    @Column(name = "ID_OPERATION_USER")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "The user name is mandatory")
    @Size(max = 45, message = "The user name can't has more than 45 characters")
    @Column(name = "OPERATION_USER_CONTACT_NAME", length = 45, nullable = false)
    private String name;

    @NotEmpty(message = "The e-mail is mandatory")
    @Size(max = 45)
    @Size(max = 45, message = "The e-mail can't has more than 45 characters")
    @Column(name = "OPERATION_USER_EMAIL", length = 45, nullable = false)
    private String email;

    @NotEmpty(message = "The password is mandatory.")
    @Size(max = 60)
    @Column(name = "PASSWORD", length = 45, nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name = "ID_ACCOUNT")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "ID_USER_ROLE")
    private Role role;
}
