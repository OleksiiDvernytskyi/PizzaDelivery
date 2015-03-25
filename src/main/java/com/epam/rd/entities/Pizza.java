package com.epam.rd.entities;

/**
 *
 * @author a
 */
public class Pizza {
    
    private String name;
    
    private Double price;
    
    private PizzaType type;

    @Override
    public String toString() {
        return "Pizza{" + "name=" + name + ", price=" + price + ", type=" + type + '}';
    }

    public Pizza(String name, Double price, PizzaType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public Pizza() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public PizzaType getType() {
        return type;
    }

    public void setType(PizzaType type) {
        this.type = type;
    }
}
