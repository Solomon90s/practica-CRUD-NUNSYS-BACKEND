package com.example.usuarios.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userSequence")
    @Column(name = "Id")
    private Long id;

    @Column(name = "Nombre", length = 150, nullable = false)
    @Size(min = 3, max = 150)
    private String name;

    @Column(name = "Apellidos", length = 200, nullable = false)
    private String apellidos;

    @Column(name = "Email", length = 200, nullable = false)
    private String email;

    @Column(name = "Rol", nullable = false)
    private String roles;


    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

}
