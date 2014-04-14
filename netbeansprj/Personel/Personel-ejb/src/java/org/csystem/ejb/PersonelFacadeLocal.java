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
public interface PersonelFacadeLocal {

    void create(Personel personel);

    void edit(Personel personel);

    void remove(Personel personel);

    Personel find(Object id);

    List<Personel> findAll();

    List<Personel> findRange(int[] range);

    int count();
    
}
