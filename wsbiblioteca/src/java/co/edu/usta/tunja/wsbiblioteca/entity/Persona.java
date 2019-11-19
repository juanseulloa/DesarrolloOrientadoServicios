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
@Table(name = "persona")
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    
    @Column(name = "idestudiante")
    private Integer idestudiante;
    
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombreestudiante")
    private String nombreestudiante;
    
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "apellidoestudiante")
    private String apellidoestudiante;
    
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "codigo")
    private String codigo;
    
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "documento")
    private String documento;
    
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "email")
    private String email;
    
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "dependencia")
    private String dependencia;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idestudiante")
    private Collection<Prestamo> prestamoCollection;

    public Persona() {
    }

    public Persona(Integer idestudiante) {
        this.idestudiante = idestudiante;
    }

    public Persona(Integer idestudiante, String nombreestudiante, String apellidoestudiante, String codigo, String documento, String email, String dependencia) {
        this.idestudiante = idestudiante;
        this.nombreestudiante = nombreestudiante;
        this.apellidoestudiante = apellidoestudiante;
        this.codigo = codigo;
        this.documento = documento;
        this.email = email;
        this.dependencia = dependencia;
    }

    public Integer getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(Integer idestudiante) {
        this.idestudiante = idestudiante;
    }

    public String getNombreestudiante() {
        return nombreestudiante;
    }

    public void setNombreestudiante(String nombreestudiante) {
        this.nombreestudiante = nombreestudiante;
    }

    public String getApellidoestudiante() {
        return apellidoestudiante;
    }

    public void setApellidoestudiante(String apellidoestudiante) {
        this.apellidoestudiante = apellidoestudiante;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public Collection<Prestamo> getPrestamoCollection() {
        return prestamoCollection;
    }

    public void setPrestamoCollection(Collection<Prestamo> prestamoCollection) {
        this.prestamoCollection = prestamoCollection;
    }

    
}
