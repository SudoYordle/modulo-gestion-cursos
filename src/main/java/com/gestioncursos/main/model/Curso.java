package com.gestioncursos.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Curso {
    private int id;
    private String nombre;
    private String descripcion;
    private String fechaInicio;
    private String fechaFin;

}
