package com.gestioncursos.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Curso {

    private int idDb;
    private String idCurso;
    private String nombre;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaFin;
}
