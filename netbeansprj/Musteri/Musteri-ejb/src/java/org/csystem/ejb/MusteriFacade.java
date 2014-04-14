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
public class MusteriFacade extends AbstractFacade<Musteri> implements MusteriFacadeLocal {
    @PersistenceContext(unitName = "Musteri-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MusteriFacade() {
        super(Musteri.class);
    }
    
}
