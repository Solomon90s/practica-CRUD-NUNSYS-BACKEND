package com.example.usuarios.domain.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "items")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userSequence")
    @Column(name = "ID")
    private Long id;

    @Column(name = "Nombre", length = 200, nullable = false)
    private String name;

    @Column(name = "Email", length = 200, nullable = false)
    private String apellidos;

    @Column(name = "Email", length = 200, nullable = false)
    private String email;

    @Column(name = "Rol", nullable = false)
    private String roles;

    @Column(name = "Acción")
    @Lob()
    private byte[] photo;



}
