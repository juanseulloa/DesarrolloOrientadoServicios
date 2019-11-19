/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.tunja.wsbiblioteca.ejb;

import co.edu.usta.tunja.wsbiblioteca.entity.PrestamoEstado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author JUANSE
 */
@Stateless
public class PrestamoEstadoFacade  extends Abstract<PrestamoEstado>{
    
    @PersistenceContext(unitName = "wsbibliotecaPU")
    private EntityManager _em;

    public PrestamoEstadoFacade() {
        super(PrestamoEstado.class);
    }

    @Override
    protected EntityManager getAdmEntidad() {
    return this._em;
    }
    
    
}
