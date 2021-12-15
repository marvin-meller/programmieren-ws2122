package edu.kit.informatik.tutorium8;

public interface Command {
    static Command fromString(String command) throws UserInputException {
        switch (command) {
            case "double":
                return new DoubleCommand();
            case "square":
                return new SquareCommand();
            case "*":
                return new MultiplyCommand();
            default:
                throw new UserInputException("unknown command");
        }
    }

    String execute(String[] args) throws UserInputException;
}
