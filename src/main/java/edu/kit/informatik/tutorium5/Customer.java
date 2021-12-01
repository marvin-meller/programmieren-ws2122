package edu.kit.informatik.tutorium5;

public class Customer extends Human {
    public Customer(String name) {
        super(name);
    }

    @Override
    public void introduce() {
        System.out.println("I'm a Customer!");
    }
}
