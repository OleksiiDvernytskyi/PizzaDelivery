package com.epam.rd.entities;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author a
 */
public class Order {
    private Long id;
    
    private Date date;
    
    private String name;
    
    private Set<Pizza> pizzas = new LinkedHashSet<>();
    
    private Double price = 0.;

    public Order(Long id, Date date, String name) {
        this.id = id;
        this.date = date;
        this.name = name;
    }

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(Set<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public Double getPrice() {
        return price;
    }
    
    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
        price += pizza.getPrice();
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", date=" + date + ", name=" + name + ", pizzas=" + pizzas + ", price=" + price + '}';
    }
    
}
