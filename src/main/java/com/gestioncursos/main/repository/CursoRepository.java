package com.gestioncursos.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestioncursos.main.model.entity.CursoEntity;

@Repository
public interface CursoRepository extends JpaRepository<CursoEntity, Integer>{

    CursoEntity findByIdCurso(int idCurso);
    Boolean existsByIdCurso(int idCurso);
    void deleteByIdCurso(int idCurso);
}
