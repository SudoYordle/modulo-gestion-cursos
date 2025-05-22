package com.gestioncursos.main.model.entity;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CursoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDb;
    @Column(unique = true)
    private String idCurso;
    private String nombre;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaFin;
}