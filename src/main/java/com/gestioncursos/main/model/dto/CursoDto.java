package com.gestioncursos.main.model.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursoDto {
    private String nombre;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaFin; 
}
