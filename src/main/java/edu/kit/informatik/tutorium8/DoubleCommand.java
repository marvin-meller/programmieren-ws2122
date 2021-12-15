package edu.kit.informatik.tutorium8;

public class DoubleCommand extends PatternCommand {
    public DoubleCommand() {
        super(INTEGER);
    }

    @Override
    protected String executeValid(String[] args) {
        int input = Integer.parseInt(args[0]);
        return Integer.toString(input * 2);
    }
}
