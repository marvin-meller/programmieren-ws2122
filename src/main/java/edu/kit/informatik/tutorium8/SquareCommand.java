package edu.kit.informatik.tutorium8;

public class SquareCommand extends PatternCommand {
    public SquareCommand() {
        super(INTEGER);
    }

    @Override
    protected String executeValid(String[] args) {
        int input = Integer.parseInt(args[0]);
        return Integer.toString(input * input);
    }
}
