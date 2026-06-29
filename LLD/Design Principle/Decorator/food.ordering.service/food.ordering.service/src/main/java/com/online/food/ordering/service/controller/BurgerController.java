package com.online.food.ordering.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.food.ordering.service.enums.BurgerList;
import com.online.food.ordering.service.enums.DecoratorList;
import com.online.food.ordering.service.interfaces.Burger;
import com.online.food.ordering.service.service.BurgerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/burger")
public class BurgerController {


    private BurgerService burgerService;

    public BurgerController(BurgerService burgerService){
        this.burgerService = burgerService;
    }


    @GetMapping("/select ")
    public Burger selectBurger(@RequestParam BurgerList burgerList) {
        return burgerService.addBurger(burgerList);
    }

    @GetMapping("/addon/{decorator} ")
    public Burger addonDecorator(@PathVariable DecoratorList decorator, @RequestBody Burger burger) {
        return burgerService.addon(decorator, burger);
    }
    
}
