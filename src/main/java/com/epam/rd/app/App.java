package com.epam.rd.app;

import com.epam.rd.entities.Order;
import com.epam.rd.entities.Pizza;
import com.epam.rd.repositories.OrderRepository;
import com.epam.rd.repositories.PizzaRepository;
import com.epam.rd.repositories.SimpleOrderRepository;
import com.epam.rd.repositories.SimplePizzaRepository;
import com.epam.rd.services.OrderService;
import com.epam.rd.services.PizzaService;
import com.epam.rd.services.SimpleOrderService;
import com.epam.rd.services.SimplePizzaService;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author a
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext repositoriesContext = new ClassPathXmlApplicationContext("test-repositories-spring.xml");
        
        ApplicationContext appContext = 
                new ClassPathXmlApplicationContext(new String[] {"service.xml"}, repositoriesContext);
        
        PizzaService pizzaService = appContext.getBean("pizzaService", PizzaService.class);
        
        List<Pizza> pizzas = pizzaService.getAllPizzas();
        
        OrderService orderService = appContext.getBean("orderService", OrderService.class);
        
        Order newOrder1 = orderService.createOrder();
        newOrder1.addPizza(pizzas.get(0));
        newOrder1.addPizza(pizzas.get(1));
        orderService.placeOrder(newOrder1);
        
        Order newOrder2 = orderService.createOrder();
        newOrder2.addPizza(pizzas.get(0));
        orderService.placeOrder(newOrder2);
        
        List<Order> orders = orderService.getAllOrders();

        System.out.println(orders);
        
    }
}
