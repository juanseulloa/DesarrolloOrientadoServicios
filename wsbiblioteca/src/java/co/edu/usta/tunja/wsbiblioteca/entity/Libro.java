/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.tunja.wsbiblioteca.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author JUANSE
 */
@Entity
@Table(name = "libro")
public class Libro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "idlibro")
    private Integer idlibro;
   
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombrelibro")
    private String nombrelibro;
   
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "edicion")
    private String edicion;
   
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "autor")
    private String autor;
    
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "anio")
    private String anio;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idlibro")
    private Collection<Prestamo> prestamoCollection;

    public Libro() {
    }

    public Libro(Integer idlibro) {
        this.idlibro = idlibro;
    }

    public Libro(Integer idlibro, String nombrelibro, String edicion, String autor, String anio) {
        this.idlibro = idlibro;
        this.nombrelibro = nombrelibro;
        this.edicion = edicion;
        this.autor = autor;
        this.anio = anio;
    }

    public Integer getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(Integer idlibro) {
        this.idlibro = idlibro;
    }

    public String getNombrelibro() {
        return nombrelibro;
    }

    public void setNombrelibro(String nombrelibro) {
        this.nombrelibro = nombrelibro;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public Collection<Prestamo> getPrestamoCollection() {
        return prestamoCollection;
    }

    public void setPrestamoCollection(Collection<Prestamo> prestamoCollection) {
        this.prestamoCollection = prestamoCollection;
    }

    
}
