package edu.kit.informatik.tutorium8;

public class MultiplyCommand extends PatternCommand {
    public MultiplyCommand() {
        super(INTEGER, INTEGER);
    }

    @Override
    protected String executeValid(String[] args) {
        int left = Integer.parseInt(args[0]);
        int right = Integer.parseInt(args[1]);
        return Integer.toString(left * right);
    }
}
