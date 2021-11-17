package edu.kit.informatik.tutorium4;

public enum Command {
    GREET {
        @Override
        protected void execute(String[] parameters) {
            System.out.println("Hello, " + parameters[0] + "!");
        }
    },

    HELP {
        @Override
        protected void execute(String[] parameters) {
            System.out.println("Help for " + parameters[0]);
        }
    },

    QUIT {
        @Override
        protected void execute(String[] parameters) {
            System.out.println("Quit...");
        }
    };

    public static void run(String input) {
        String[] words = input.split(" ", -1);
        String[] parameters = new String[words.length - 1];
        System.arraycopy(words, 1, parameters, 0, parameters.length);
        Command command;

        switch (words[0]) {
            case "greet":
                command = Command.GREET;
                break;
            case "help":
                command = Command.HELP;
                break;
            case "quit":
                command = Command.QUIT;
                break;
            default:
                System.out.println("Unknown command!");
                return;
        }

        command.execute(parameters);
    }

    protected abstract void execute(String[] parameters);
}
