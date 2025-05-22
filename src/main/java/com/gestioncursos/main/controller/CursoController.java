package com.gestioncursos.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestioncursos.main.model.Curso;
import com.gestioncursos.main.service.CursoService;

@RestController
@RequestMapping("/curso")
public class CursoController {
    @Autowired
    private CursoService cursoService;
    
    @PostMapping("/crearCurso")

    public ResponseEntity<String> ObtenerCurso(@RequestBody Curso curso) {
        return ResponseEntity.ok(cursoService.crearCurso(curso));
    }
    @GetMapping("/obtenerCurso/{idCurso}")
    public ResponseEntity<Curso> obtenerCurso(@PathVariable String idCurso) {
        Curso curso = cursoService.obtenerCurso(idCurso);
        if (curso != null) {
            return ResponseEntity.ok(curso);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping("/modificarCurso")
    public ResponseEntity<String> modificarCurso(@RequestBody Curso curso) {
        return ResponseEntity.ok(cursoService.modificarCurso(curso));
    }
    @GetMapping("/listarCursos")
    public ResponseEntity<String> listarCursos() {
        return ResponseEntity.ok(cursoService.listarCursos());
    }

    @PostMapping("/eliminarCurso/{idCurso}")
    public ResponseEntity<String> eliminarCurso(@PathVariable String idCurso) {
        return ResponseEntity.ok(cursoService.eliminarCurso(idCurso));
    }
}
