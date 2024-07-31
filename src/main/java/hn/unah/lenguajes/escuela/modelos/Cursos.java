package hn.unah.lenguajes.escuela.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="cursos")
@Data
public class Cursos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigocurso")
    private long codigoCurso;

    private String nombre;

    private int duracion;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="codigomaestro", referencedColumnName = "codigomaestro")
    private Maestro maestro;
    
}
