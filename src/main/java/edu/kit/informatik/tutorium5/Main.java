package edu.kit.informatik.tutorium5;

import edu.kit.informatik.tutorium5.polymorphic.Polymorphic;
import edu.kit.informatik.tutorium5.polymorphic.plugin.FancyStrategy;

public final class Main {
    public static void main(String[] args) {
        Polymorphic.badSystemCheck("deep");
        Polymorphic.goodSystemCheck(new FancyStrategy());

        Human human = new Human("Human");
        human.tellLifeStory();

        Human customer = new Customer("Customer");
        customer.tellLifeStory();
    }

    private Main() {}
}
