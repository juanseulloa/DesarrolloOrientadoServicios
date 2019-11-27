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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "prestamo")
public class Prestamo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "idprestamo")
    private Integer idprestamo;
    
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "fechaprestamo")
    private String fechaprestamo;
    
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "fechaentrega")
    private String fechaentrega;
    
    @JoinColumn(name = "idlibro", referencedColumnName = "idlibro")
    @ManyToOne(optional = false)
    private Libro idlibro;
    @JoinColumn(name = "idestudiante", referencedColumnName = "idestudiante")
    @ManyToOne(optional = false)
    private Persona idestudiante;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idprestamo")
    private Collection<PrestamoEstado> prestamoEstadoCollection;

    public Prestamo() {
    }

    public Prestamo(Integer idprestamo) {
        this.idprestamo = idprestamo;
    }

    public Prestamo(Integer idprestamo, String fechaprestamo, String fechaentrega) {
        this.idprestamo = idprestamo;
        this.fechaprestamo = fechaprestamo;
        this.fechaentrega = fechaentrega;
    }

    public Integer getIdprestamo() {
        return idprestamo;
    }

    public void setIdprestamo(Integer idprestamo) {
        this.idprestamo = idprestamo;
    }

    public String getFechaprestamo() {
        return fechaprestamo;
    }

    public void setFechaprestamo(String fechaprestamo) {
        this.fechaprestamo = fechaprestamo;
    }

    public String getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(String fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public Libro getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(Libro idlibro) {
        this.idlibro = idlibro;
    }

    public Persona getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(Persona idestudiante) {
        this.idestudiante = idestudiante;
    }

    public Collection<PrestamoEstado> getPrestamoEstadoCollection() {
        return prestamoEstadoCollection;
    }

    public void setPrestamoEstadoCollection(Collection<PrestamoEstado> prestamoEstadoCollection) {
        this.prestamoEstadoCollection = prestamoEstadoCollection;
    }

}
