package hn.unah.lenguajes.escuela.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.escuela.modelos.Direccion;

@Repository
public interface DireccionRepositorio extends JpaRepository<Direccion, Long>{
    
}
