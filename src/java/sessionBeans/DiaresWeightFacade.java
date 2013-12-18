/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionBeans;

import entities.DiaresWeight;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author maraby
 */
@Stateless
public class DiaresWeightFacade extends AbstractFacade<DiaresWeight> {
    @PersistenceContext(unitName = "ProbePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DiaresWeightFacade() {
        super(DiaresWeight.class);
    }
    
}
