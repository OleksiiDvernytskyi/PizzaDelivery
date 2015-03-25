package com.epam.rd.repositories;

import com.epam.rd.entities.Order;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;


public class SimpleOrderRepository implements OrderRepository {
    
    private Long lastId = 0L;
    
    private final List<Order> orders = new LinkedList<>();
    
    public SimpleOrderRepository() {
        
    }
    
    
    @Override
    public List<Order> readAll() {
        return orders;
    }

    @Override
    public Order read(Long id) {
        for (Order order : orders) {
            if (order.getId().equals(id)) {
                return order;
            }
        }
        return null;
    }

    @Override
    public Order createNew() {
        Order order = new Order();
        order.setId(lastId++);
        order.setDate(new Date());
        order.setName(order.getId() + " -- " + order.getDate());
        orders.add(order);
        return order;
    }

    @Override
    public void save(Order order) {
        if (!orders.contains(order)) {
            order.setId(lastId++);
            orders.add(order);
        }
    }

    @Override
    public Long newId() {
        return ++lastId;
    }
    
}
