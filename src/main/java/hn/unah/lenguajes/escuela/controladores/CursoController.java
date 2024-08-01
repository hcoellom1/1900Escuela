package hn.unah.lenguajes.escuela.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.escuela.modelos.Cursos;
import hn.unah.lenguajes.escuela.repositorios.CursosRepositorio;
import hn.unah.lenguajes.escuela.servicios.CursosServicio;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    @Autowired
    private CursosServicio cursosServicio;
    

    @PostMapping("/asociar/{codigo}")
    public Cursos asociarMaestro(@PathVariable(name="codigo") String codigo,
                                  @RequestBody Cursos cursos) {
        return this.cursosServicio.asociarCursoMaestro(codigo, cursos);
    }
    
    
}
