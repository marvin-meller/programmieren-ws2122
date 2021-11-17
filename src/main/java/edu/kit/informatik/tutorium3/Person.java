package edu.kit.informatik.tutorium3;

public class Person {
    public static void main(final String[] args) {
        new Person(
            "Max Mustermann",
            new Address("DE", "76131", "Karlsstraße 31"),
            1950
        );
    }

    private String name;
    private Address address;
    private int birthYear;

    public Person(String name, Address address, int birthYear) {
        this.name = name;
        this.address = address;
        this.birthYear = birthYear;
    }

    public void sayHello() {
        System.out.println("Hello, I'm " + name +
            "and I was born in " + birthYear + ".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
