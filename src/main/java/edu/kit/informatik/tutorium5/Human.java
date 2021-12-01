package edu.kit.informatik.tutorium5;

public class Human {
    private final String name;

    public Human(String name) {
        this.name = name;
    }

    public void tellLifeStory() {
        introduce();
        System.out.println("Bla bla bla...");
    }

    public void introduce() {
        System.out.println(String.format(
            "Hello, I'm %s", name
        ));
    }

    public String getName() {
        return name;
    }
}
