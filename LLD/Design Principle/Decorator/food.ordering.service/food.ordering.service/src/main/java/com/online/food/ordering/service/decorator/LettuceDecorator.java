package com.online.food.ordering.service.decorator;


import com.online.food.ordering.service.interfaces.Burger;


public class LettuceDecorator extends BurgerDecorator{

    public LettuceDecorator(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription(){
        return  burger.getDescription() + " + Lettuce ";
    }
    
    @Override
    public double getCost(){
        return burger.getCost() + 23.5;
    }

}
