package com.online.food.ordering.service.decorator;



import com.online.food.ordering.service.interfaces.Burger;


public class ExtraPattyDecorator extends BurgerDecorator{

    public ExtraPattyDecorator(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription(){
        return  burger.getDescription() + " + Extra Patty ";
    }
    
    @Override
    public double getCost(){
        return burger.getCost() + 32;
    }

}
