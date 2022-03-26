package com.company;

public class Cat extends Animal {
    public Cat(String name, String favoriteFood) {super(name, favoriteFood);}

    @Override
    public String manageSelf()
    {
        return "Я " + name + " и моя любимая еда " + favoriteFood + "\nМяу - Мяу";
    }
}

