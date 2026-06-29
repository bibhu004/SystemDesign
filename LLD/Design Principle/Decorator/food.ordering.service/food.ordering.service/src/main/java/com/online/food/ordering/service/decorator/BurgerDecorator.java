package com.online.food.ordering.service.decorator;

import com.online.food.ordering.service.enums.BurgerList;
import com.online.food.ordering.service.interfaces.Burger;

public abstract class BurgerDecorator implements Burger{

    protected Burger burger;

    public BurgerDecorator(Burger burger){
        this.burger = burger;
    }

  
    public BurgerList getBurgerName(){
        return burger.getBurgerName();
    }


}
