package com.example.HW21.repository;


public class Item {
    private final String name;
    private final int price;

    private final int id;


    public Item(String name, int price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
