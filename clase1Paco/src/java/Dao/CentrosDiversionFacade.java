/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import models.CentrosDiversion;

/**
 *
 * @author alberto
 */
@Stateless
public class CentrosDiversionFacade extends AbstractFacade<CentrosDiversion> implements CentrosDiversionFacadeLocal {
    @PersistenceContext(unitName = "clase1PacoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CentrosDiversionFacade() {
        super(CentrosDiversion.class);
    }
    
}
