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
public interface DiscountCodeFacadeLocal {

    void create(DiscountCode discountCode);

    void edit(DiscountCode discountCode);

    void remove(DiscountCode discountCode);

    DiscountCode find(Object id);

    List<DiscountCode> findAll();

    List<DiscountCode> findRange(int[] range);

    int count();
    
}
