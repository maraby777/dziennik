/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package managedBean;

import entities.Food;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;
import sessionBeans.FoodFacade;

/**
 *
 * @author maraby
 */
@ManagedBean//аннотация
@RequestScoped//область видимости бина
public class FoodManagedBean {
    @EJB
    private FoodFacade foodFacade;
    private Food food;
    
    /**
     * Creates a new instance of FoodManagedBean
     */
    public FoodManagedBean() {
        this.food = new Food();
    }
    
    
}
