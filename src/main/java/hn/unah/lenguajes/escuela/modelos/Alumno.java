package hn.unah.lenguajes.escuela.modelos;

import java.util.List;

import lombok.Data;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="alumno")
@Data
public class Alumno {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="numerocuenta")
    private long numeroCuenta;

    private String nombre;

    private String apellido;

    private String correo;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name="alumno_curso",
        joinColumns = @JoinColumn(name="numerocuenta"),
        inverseJoinColumns = @JoinColumn(name="codigocurso")
    )
    private List<Cursos> cursos;
}
