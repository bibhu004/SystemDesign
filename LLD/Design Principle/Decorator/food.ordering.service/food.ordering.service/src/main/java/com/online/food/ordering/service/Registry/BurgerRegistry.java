package com.online.food.ordering.service.Registry;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.online.food.ordering.service.enums.BurgerList;
import com.online.food.ordering.service.interfaces.Burger;

@Component
public class BurgerRegistry {

    HashMap<BurgerList, Burger> burgerRegistry;

    public BurgerRegistry(List<Burger> burgers){
        this.burgerRegistry = new HashMap<>();

        for(Burger burger : burgers){
            burgerRegistry.put(burger.getBurgerName(), burger);
        }
    }

    public Burger getBurgerByName(BurgerList burgerList){
        return burgerRegistry.get(burgerList);
    }

}
