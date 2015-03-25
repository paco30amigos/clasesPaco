/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import models.TipoLugar;

/**
 *
 * @author alberto
 */
@Stateless
public class TipoLugarFacade extends AbstractFacade<TipoLugar> implements TipoLugarFacadeLocal {
    @PersistenceContext(unitName = "clase1PacoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoLugarFacade() {
        super(TipoLugar.class);
    }
    
}
