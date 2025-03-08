package com.example.medicalrdv.model;

import javax.management.relation.Role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name= "Utilisateurs")


public class Users {
       @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "nom")
    private String name;

    @Column(nullable = false, name = "Prenom")
    private String firtName;

    @Column(nullable = false, name = "E-mail", unique = true)
    private String email;

    @Column(nullable = false, name = "MotDePasse")
    private String password;

    @Column(nullable = false, name = "DateDeNaissance")
    private String dateDeNaissance;

    @Column(nullable = false, name = "Role")
    private Role role;


}
