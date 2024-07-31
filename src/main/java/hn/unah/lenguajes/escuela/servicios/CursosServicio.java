package hn.unah.lenguajes.escuela.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.escuela.modelos.Cursos;
import hn.unah.lenguajes.escuela.repositorios.CursosRepositorio;
import hn.unah.lenguajes.escuela.repositorios.MaestroRepositorio;

@Service
public class CursosServicio {
    
    @Autowired
    private CursosRepositorio cursosRepositorio;

    @Autowired
    private MaestroRepositorio maestroRepositorio;

    public Cursos asociarCursoMaestro(String codigoMaestro, Cursos cursos){
        if(this.maestroRepositorio.existsById(codigoMaestro)){
            cursos.setMaestro(this.maestroRepositorio.findById(codigoMaestro).get());
            return this.cursosRepositorio.save(cursos);
        }

        return null;
    }
}
