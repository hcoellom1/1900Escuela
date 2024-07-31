package hn.unah.lenguajes.escuela.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.lenguajes.escuela.modelos.Cursos;

public interface CursosRepositorio extends JpaRepository<Cursos, Long>{
    
}
