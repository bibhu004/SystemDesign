package com.online.food.ordering.service.service;

import org.springframework.stereotype.Service;

import com.online.food.ordering.service.Registry.BurgerRegistry;
import com.online.food.ordering.service.decorator.CheeseDecorator;
import com.online.food.ordering.service.decorator.ExtraPattyDecorator;
import com.online.food.ordering.service.decorator.LettuceDecorator;
import com.online.food.ordering.service.enums.BurgerList;
import com.online.food.ordering.service.enums.DecoratorList;
import com.online.food.ordering.service.interfaces.Burger;

@Service
public class BurgerService {

    private BurgerRegistry burgerRegistry;

    public BurgerService(BurgerRegistry burgerRegistry){
        this.burgerRegistry = burgerRegistry;
    }

    public Burger addBurger(BurgerList burgerList){
        Burger burger = burgerRegistry.getBurgerByName(burgerList);
        return burger;
    }

    public Burger addon(DecoratorList decoratorList, Burger burger){

        if(decoratorList.equals(DecoratorList.CHEESE)){
            return new CheeseDecorator(burger);
        }
        else if(decoratorList.equals(DecoratorList.LETTUCE)){
            return new LettuceDecorator(burger);
        }
        else if(decoratorList.equals(DecoratorList.PATTY)){
            return new ExtraPattyDecorator(burger);
        }
        throw new RuntimeException("No such add-on present");
    }
}
