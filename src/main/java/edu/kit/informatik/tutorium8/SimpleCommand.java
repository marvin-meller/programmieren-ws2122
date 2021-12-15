package edu.kit.informatik.tutorium8;

public abstract class SimpleCommand implements Command {
    private final int arguments;

    public SimpleCommand(int arguments) {
        this.arguments = arguments;
    }

    @Override
    public String execute(String[] args) throws UserInputException {
        validate(args);
        return executeValid(args);
    }

    protected void validate(String[] args) throws UserInputException {
        if (args.length != arguments) throw new UserInputException(String.format("expected %s arguments", arguments));
    }

    protected abstract String executeValid(String[] args) throws UserInputException;
}
