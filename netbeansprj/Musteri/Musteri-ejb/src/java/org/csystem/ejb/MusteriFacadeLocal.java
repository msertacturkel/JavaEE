/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.csystem.ejb;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Administrator
 */
@Local
public interface MusteriFacadeLocal {

    void create(Musteri musteri);

    void edit(Musteri musteri);

    void remove(Musteri musteri);

    Musteri find(Object id);

    List<Musteri> findAll();

    List<Musteri> findRange(int[] range);

    int count();
    
}
