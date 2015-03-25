package com.epam.rd.services;

import com.epam.rd.entities.Pizza;
import com.epam.rd.entities.PizzaType;
import com.epam.rd.repositories.PizzaRepository;
import java.util.List;

/**
 *
 * @author a
 */
public interface PizzaService {
    
    List<Pizza> getAllPizzas();
    
    List<Pizza> getPizzasByType(PizzaType pizzaType);
    
}
