package com.epam.rd.services;

import com.epam.rd.entities.Pizza;
import com.epam.rd.entities.PizzaType;
import com.epam.rd.repositories.PizzaRepository;
import java.util.LinkedList;
import java.util.List;


public class SimplePizzaService implements PizzaService {
    
    private final PizzaRepository pizzaRepository;

    public SimplePizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }
    
    @Override
    public List<Pizza> getAllPizzas() {
        return pizzaRepository.readAll();
    }

    @Override
    public List<Pizza> getPizzasByType(PizzaType pizzaType) {
        List<Pizza> resultPizzaList = new LinkedList<>();
        List<Pizza> allPizzas = pizzaRepository.readAll();
        for (Pizza pizza : allPizzas) {
            if (pizza.getType() == pizzaType) {
                resultPizzaList.add(pizza);
            }
        }
        return resultPizzaList;
    }
    
}
