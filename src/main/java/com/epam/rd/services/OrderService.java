package com.epam.rd.services;

import com.epam.rd.entities.Order;
import java.util.List;

/**
 *
 * @author a
 */
public interface OrderService {
    List<Order> getAllOrders();
    Order getOrderById(Long id);
    Order createOrder();
    void placeOrder(Order order);
}
