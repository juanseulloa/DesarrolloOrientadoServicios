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
@Table(name = "estado")

public class Estado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    
    @Column(name = "idestado")
    private Integer idestado;
    
    
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "tipoestado")
    private String tipoestado;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idestado")
    private Collection<PrestamoEstado> prestamoEstadoCollection;

    public Estado() {
    }

    public Estado(Integer idestado) {
        this.idestado = idestado;
    }

    public Estado(Integer idestado, String tipoestado) {
        this.idestado = idestado;
        this.tipoestado = tipoestado;
    }

    public Integer getIdestado() {
        return idestado;
    }

    public void setIdestado(Integer idestado) {
        this.idestado = idestado;
    }

    public String getTipoestado() {
        return tipoestado;
    }

    public void setTipoestado(String tipoestado) {
        this.tipoestado = tipoestado;
    }

    public Collection<PrestamoEstado> getPrestamoEstadoCollection() {
        return prestamoEstadoCollection;
    }

    public void setPrestamoEstadoCollection(Collection<PrestamoEstado> prestamoEstadoCollection) {
        this.prestamoEstadoCollection = prestamoEstadoCollection;
    }
}