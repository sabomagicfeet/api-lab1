package com.techreturners.apilab1.model;

// POJO (Plain Old Java Object)
public class Coffee {

    private final long id;
    private final String name;

    public Coffee(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
