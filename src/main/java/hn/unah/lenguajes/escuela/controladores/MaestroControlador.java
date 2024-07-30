package hn.unah.lenguajes.escuela.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.escuela.modelos.Maestro;
import hn.unah.lenguajes.escuela.servicios.MaestroServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/maestros")
public class MaestroControlador {

    @Autowired
    private MaestroServicio maestroServicio;

    @GetMapping("/obtener/todos")
    public List<Maestro> obtenerTodos() {
        return this.maestroServicio.obtenerTodos();
    }

    @PostMapping("/crear/nuevo")
    public Maestro crearMaestro(@RequestBody Maestro nvMaestro) {
        return this.maestroServicio.crearNuevoMaestro(nvMaestro);        
    }
    
    
    
}
