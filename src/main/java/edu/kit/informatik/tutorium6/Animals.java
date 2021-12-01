package edu.kit.informatik.tutorium6;

public class Animals {
    public static void main(String[] args) {
        Good[] goodies = {
            new Dog(),
            new Sparrow(),
            new Sparrow()
        };

        allBeGood(goodies);
    }

    private static void allBeGood(Good[] goodies) {
        for (Good goody : goodies) {
            goody.beGood();
        }
    }
}

abstract class Animal {
    // private final int id;

    // public Animal(int id) {
    //    this.id = id;
    // }

    // abstract void makeNoise();
}

interface Mammal {
    void walk();
}

interface Bird {
    void fly();
}

interface Good {
    void beGood();
}

interface Bad {
    void beBad();
}

class Dog extends Animal implements Good, Mammal {
    @Override
    public void beGood() {
        System.out.println("Woof");
    }

    @Override
    public void walk() {
        System.out.println("Dog walks");
    }
}

class Cat extends Animal implements Bad, Mammal {
    @Override
    public void beBad() {
        System.out.println("Hisss");
    }

    @Override
    public void walk() {
        System.out.println("Cat walks");
    }
}

class Sparrow extends Animal implements Good, Bird {
    @Override
    public void beGood() {
        System.out.println("Pieps");
    }

    @Override
    public void fly() {
        System.out.println("Flip flip flip");
    }
}

class Pigeon extends Animal implements Bad, Bird {
    @Override
    public void beBad() {
        System.out.println("*shits on you*");
    }

    @Override
    public void fly() {
        System.out.println("Flap flap flap");
    }
}