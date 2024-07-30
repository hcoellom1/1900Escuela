package hn.unah.lenguajes.escuela.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        
        Maestro maestroGuardar = this.maestroRepositorio.save(nvMaestro);

        Direccion direccion = nvMaestro.getDireccion();
        direccion.setMaestro(maestroGuardar);

        this.direccionRepositorio.save(direccion);

        return maestroGuardar;
    }

    
}