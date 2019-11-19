/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.tunja.wsbiblioteca.ejb;

import co.edu.usta.tunja.wsbiblioteca.entity.Libro;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author JUANSE
 */
@Stateless
public class LibroFacade extends Abstract<Libro>{

    @PersistenceContext(unitName = "wsbibliotecaPU")
    private EntityManager _em;

    public LibroFacade() {
        super(Libro.class);
    }
    
    @Override
    protected EntityManager getAdmEntidad() {
   return this._em;
    }
    
}
