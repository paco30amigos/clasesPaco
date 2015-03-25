/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import models.Pais;

/**
 *
 * @author alberto
 */
@Stateless
public class PaisFacade extends AbstractFacade<Pais> implements PaisFacadeLocal {
    @PersistenceContext(unitName = "clase1PacoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PaisFacade() {
        super(Pais.class);
    }
    
}
