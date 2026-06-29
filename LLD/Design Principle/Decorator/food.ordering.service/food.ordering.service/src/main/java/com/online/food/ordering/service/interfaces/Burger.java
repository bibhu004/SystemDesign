package com.online.food.ordering.service.interfaces;

import com.online.food.ordering.service.enums.BurgerList;

public interface Burger {
    BurgerList getBurgerName();
    String getDescription();
    double getCost();

}
