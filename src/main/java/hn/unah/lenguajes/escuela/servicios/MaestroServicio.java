package hn.unah.lenguajes.escuela.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.escuela.modelos.Cursos;
import hn.unah.lenguajes.escuela.modelos.Direccion;
import hn.unah.lenguajes.escuela.modelos.Maestro;
import hn.unah.lenguajes.escuela.repositorios.DireccionRepositorio;
import hn.unah.lenguajes.escuela.repositorios.MaestroRepositorio;

@Service
public class MaestroServicio {
    
    @Autowired
    private MaestroRepositorio maestroRepositorio;

    @Autowired
    private DireccionRepositorio direccionRepositorio;

    public List<Maestro> obtenerTodos(){
        return this.maestroRepositorio.findAll();
    }

    public Maestro crearNuevoMaestro(Maestro nvMaestro){        
        if(this.maestroRepositorio.existsById(nvMaestro.getCodigoMaestro())){
            return null;
        }
                
        Direccion direccion = nvMaestro.getDireccion();
        if(direccion !=null ){
            direccion.setMaestro(nvMaestro);
        }
            
        List<Cursos> cursos = nvMaestro.getCursos();
        if(cursos != null){
            for(Cursos curso:cursos){
               curso.setMaestro(nvMaestro); 
            }            
        }
        
        return this.maestroRepositorio.save(nvMaestro);     
    }

    
}