/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.tunja.wsbiblioteca.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author JUANSE
 */
@Entity
@Table(name = "prestamo_estado")

public class PrestamoEstado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idprestamoestado")
    private Integer idprestamoestado;

    @NotNull
    @Column(name = "hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hora;

    @JoinColumn(name = "idestado", referencedColumnName = "idestado")
    @ManyToOne(optional = false)
    private Estado idestado;
    @JoinColumn(name = "idprestamo", referencedColumnName = "idprestamo")
    @ManyToOne(optional = false)
    private Prestamo idprestamo;

    public PrestamoEstado() {
    }

    public PrestamoEstado(Integer idprestamoestado) {
        this.idprestamoestado = idprestamoestado;
    }

    public PrestamoEstado(Integer idprestamoestado, Date hora) {
        this.idprestamoestado = idprestamoestado;
        this.hora = hora;
    }

    public Integer getIdprestamoestado() {
        return idprestamoestado;
    }

    public void setIdprestamoestado(Integer idprestamoestado) {
        this.idprestamoestado = idprestamoestado;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Estado getIdestado() {
        return idestado;
    }

    public void setIdestado(Estado idestado) {
        this.idestado = idestado;
    }

    public Prestamo getIdprestamo() {
        return idprestamo;
    }

    public void setIdprestamo(Prestamo idprestamo) {
        this.idprestamo = idprestamo;
    }

    
}
