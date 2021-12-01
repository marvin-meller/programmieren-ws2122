package edu.kit.informatik.tutorium6;

public class Main {
    public static void main(String[] args) {
        Command command = new HelpCommand();
        command.execute();
    }
}

class Command {
    public void execute() {
        System.out.println("I don't know what to do.");
    }
}

class HelpCommand extends Command {
    @Override
    public void execute() {
        System.out.println("I'm the help command!");
    }
}