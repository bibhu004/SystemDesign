package com.online.food.ordering.service.product;

import org.springframework.stereotype.Component;

import com.online.food.ordering.service.enums.BurgerList;
import com.online.food.ordering.service.interfaces.Burger;

@Component
public class ChickenBurger implements Burger{

    @Override
    public BurgerList getBurgerName(){
        return BurgerList.CHICKEN;
    }
    @Override
    public String getDescription(){
        return "Chicken Burger ";
    }
    
    @Override
    public double getCost(){
        return 100.0;
    }

}
