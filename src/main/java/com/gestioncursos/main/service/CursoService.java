package com.gestioncursos.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestioncursos.main.model.Curso;
import com.gestioncursos.main.model.entity.CursoEntity;
import com.gestioncursos.main.repository.CursoRepository;

@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;
    public String crearCurso(Curso curso){
        try{
            Boolean estado = cursoRepository.existsByIdCurso(curso.getIdCurso());
            if (!estado){
                CursoEntity cursoNuevo = new CursoEntity();
                cursoNuevo.setIdCurso(curso.getIdCurso());
                cursoNuevo.setNombre(curso.getNombre());
                cursoNuevo.setDescripcion(curso.getDescripcion());
                cursoNuevo.setFechaInicio(curso.getFechaInicio());
                cursoNuevo.setFechaFin(curso.getFechaFin());
                cursoRepository.save(cursoNuevo);
                return "Curso creado correctamente";
            }
                return "El curso ya existe";
            }
        catch (Exception e){
            return "Error al crear el curso: " + e.getMessage();
        }
    }

    public Curso obtenerCurso(int idCurso){
        try{
            CursoEntity curso = cursoRepository.findByIdCurso(idCurso);
            if (curso != null){
                Curso cursoEncontrado = new Curso(
                    curso.getIdCurso(),
                    curso.getNombre(),
                    curso.getDescripcion(),
                    curso.getFechaInicio(),
                    curso.getFechaFin()
                );
                return cursoEncontrado;
            }
            return null;
        }
        catch (Exception e){
            return null;
        }
    }
}
