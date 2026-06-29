package com.online.food.ordering.service.decorator;

import com.online.food.ordering.service.interfaces.Burger;


public class CheeseDecorator extends BurgerDecorator{

    public CheeseDecorator(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription(){
        return  burger.getDescription() + " + Cheese ";
    }
    
    @Override
    public double getCost(){
        return burger.getCost() + 18;
    }

}
