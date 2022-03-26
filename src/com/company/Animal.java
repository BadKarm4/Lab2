package com.company;

public abstract class Animal {
    protected String name;
    protected String favoriteFood;

    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
    }

    public abstract String manageSelf();
}

