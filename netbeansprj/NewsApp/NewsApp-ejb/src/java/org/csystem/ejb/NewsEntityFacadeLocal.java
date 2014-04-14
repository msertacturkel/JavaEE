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
public interface NewsEntityFacadeLocal {

    void create(NewsEntity newsEntity);

    void edit(NewsEntity newsEntity);

    void remove(NewsEntity newsEntity);

    NewsEntity find(Object id);

    List<NewsEntity> findAll();

    List<NewsEntity> findRange(int[] range);

    int count();
    
}
