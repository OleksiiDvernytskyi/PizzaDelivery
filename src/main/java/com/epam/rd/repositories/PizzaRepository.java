package com.epam.rd.repositories;

import com.epam.rd.entities.Pizza;
import java.util.List;

/**
 *
 * @author a
 */
public interface PizzaRepository {
    List<Pizza> readAll();
}
