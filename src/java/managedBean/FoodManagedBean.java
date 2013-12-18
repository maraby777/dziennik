/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author maraby
 */
@ManagedBean//аннотация
@RequestScoped//область видимости бина
public class FoodManagedBean {

    /**
     * Creates a new instance of FoodManagedBean
     */
    public FoodManagedBean() {
    }
    
}
