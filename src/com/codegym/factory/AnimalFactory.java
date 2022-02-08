package com.codegym.factory;

public class AnimalFactory {
    public static Animal getAnimal(String type) {
        if (type.equals("Dog")) {
            return new Dog();
        } else if (type.equals("Cat")) {
            return new Cat();
        } else {
            return null;
        }
    }
}
