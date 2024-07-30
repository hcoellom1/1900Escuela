package hn.unah.lenguajes.escuela.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.escuela.modelos.Maestro;

@Repository
public interface MaestroRepositorio extends JpaRepository<Maestro, String>{
    
}
