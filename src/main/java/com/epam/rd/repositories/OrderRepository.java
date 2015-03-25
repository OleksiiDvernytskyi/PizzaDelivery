package com.epam.rd.repositories;

import com.epam.rd.entities.Order;
import java.util.List;

/**
 *
 * @author a
 */
public interface OrderRepository {
    List<Order> readAll();
    Order read(Long id);
    Order createNew();
    void save(Order order);

    public Long newId();
}
