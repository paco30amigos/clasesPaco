/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import javax.ejb.Local;
import models.TipoLugar;

/**
 *
 * @author alberto
 */
@Local
public interface TipoLugarFacadeLocal {

    void create(TipoLugar tipoLugar);

    void edit(TipoLugar tipoLugar);

    void remove(TipoLugar tipoLugar);

    TipoLugar find(Object id);

    List<TipoLugar> findAll();

    List<TipoLugar> findRange(int[] range);

    int count();
    
}
