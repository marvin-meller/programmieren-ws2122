package edu.kit.informatik.tutorium5.polymorphic.plugin;

import edu.kit.informatik.tutorium5.polymorphic.Strategy;

public class FancyStrategy extends Strategy {
    @Override
    public void execute() {
        System.out.println("My fancy plugin strategy");
    }
}
