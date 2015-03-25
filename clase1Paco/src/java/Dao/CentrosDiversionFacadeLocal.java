/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import javax.ejb.Local;
import models.CentrosDiversion;

/**
 *
 * @author alberto
 */
@Local
public interface CentrosDiversionFacadeLocal {

    void create(CentrosDiversion centrosDiversion);

    void edit(CentrosDiversion centrosDiversion);

    void remove(CentrosDiversion centrosDiversion);

    CentrosDiversion find(Object id);

    List<CentrosDiversion> findAll();

    List<CentrosDiversion> findRange(int[] range);

    int count();
    
}
