package com.example.medicalrdv.model;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Rendez-vous")
public class Appointements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="Date", nullable=false)
    private Date date;
    
    @Column(name="Heures", nullable=false)
    private Time heure;

    @Column(name="Statut", nullable=false)
    private String statust ;



}
