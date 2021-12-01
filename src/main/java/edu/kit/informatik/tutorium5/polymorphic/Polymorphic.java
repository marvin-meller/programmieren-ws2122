package edu.kit.informatik.tutorium5.polymorphic;

public class Polymorphic {
    public static void goodSystemCheck(Strategy strategy) {
        System.out.println("Checking the system now");
        strategy.execute();
    }

    public static void badSystemCheck(String strategy) {
        System.out.println("Checking the system now");

        switch (strategy) {
            case "quick":
                System.out.println("Quick system check...");
                break;
            case "deep":
                System.out.println("Deep system check...");
                break;
        }
    }
}
