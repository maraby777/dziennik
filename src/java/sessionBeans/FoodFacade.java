/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionBeans;

import entities.Food;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author maraby
 */
@Stateless //важная аннотация
public class FoodFacade extends AbstractFacade<Food> {
    @PersistenceContext(unitName = "ProbePU") //показывает с каким соединением работать классу

        
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FoodFacade() {
        super(Food.class);
    }
    
}
