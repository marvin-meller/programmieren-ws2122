package edu.kit.informatik.tutorium7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>(Arrays.asList(
            new Person("abc", 0),
            new Person("bcd", 0),
            new Person("abc", 1),
            new Person("abc", 0)
        ));

        System.out.println(people.size());
    }

    private final String name;
    private final int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("called equals");
        if (!(obj instanceof Person)) return false;
        Person person = (Person) obj;
        if(!name.equals(person.name)) return false;
        if(birthYear != person.birthYear) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthYear);
    }
}
