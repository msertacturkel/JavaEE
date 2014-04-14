/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.csystem.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Administrator
 */
@Stateless
public class PersonelFacade extends AbstractFacade<Personel> implements PersonelFacadeLocal {
    @PersistenceContext(unitName = "Personel-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonelFacade() {
        super(Personel.class);
    }
    
}
