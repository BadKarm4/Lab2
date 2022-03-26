package com.company;

public class Dog extends Animal {
    public Dog(String name, String favoriteFood) {super(name, favoriteFood);}

    @Override
    public String manageSelf()
    {
        return "Я " + name + " и моя любимая еда " + favoriteFood + "\nГав - гав";
    }
}
