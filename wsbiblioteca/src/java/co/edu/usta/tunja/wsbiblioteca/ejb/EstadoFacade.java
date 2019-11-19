/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.tunja.wsbiblioteca.ejb;

import co.edu.usta.tunja.wsbiblioteca.entity.Estado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author JUANSE
 */
@Stateless
public class EstadoFacade extends Abstract<Estado>{
    
    @PersistenceContext(unitName = "wsbibliotecaPU")
    private EntityManager _em;

    public EstadoFacade() {
        super(Estado.class);
    }

    @Override
    protected EntityManager getAdmEntidad() {
    return this._em;
    }
    
    
    
    
}
