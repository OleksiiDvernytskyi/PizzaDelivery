package com.epam.rd.repositories;

import com.epam.rd.entities.Pizza;
import com.epam.rd.entities.PizzaType;
import java.util.LinkedList;
import java.util.List;


public class SimplePizzaRepository implements PizzaRepository {

    private List<Pizza> pizzas = new LinkedList<>();
    
    public SimplePizzaRepository() {

    }
    
    @Override
    public List<Pizza> readAll() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }
    
}
