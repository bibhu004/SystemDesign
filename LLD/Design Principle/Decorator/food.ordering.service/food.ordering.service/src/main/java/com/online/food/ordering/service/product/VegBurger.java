package com.online.food.ordering.service.product;

import org.springframework.stereotype.Component;

import com.online.food.ordering.service.enums.BurgerList;
import com.online.food.ordering.service.interfaces.Burger;

@Component
public class VegBurger implements Burger{

    @Override
    public BurgerList getBurgerName(){
        return BurgerList.VEG;
    }
    @Override
    public String getDescription(){
        return "Veg Burger ";
    }
    
    @Override
    public double getCost(){
        return 100.0;
    }

}