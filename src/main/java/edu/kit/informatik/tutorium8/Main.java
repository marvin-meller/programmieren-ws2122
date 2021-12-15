package edu.kit.informatik.tutorium8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            run(scanner);
        }
    }

    private static void run(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("quit")) break;

            String output;

            try {
                output = processUserInput(input);
            } catch (UserInputException e) {
                System.err.printf("Error, %s%n", e.getMessage());
                continue;
            }

            System.out.println(output);
        }
    }

    private static String processUserInput(String input) throws UserInputException {
        String[] words = input.split(" ", -1);
        Command command = Command.fromString(words[0]);
        String[] args = new String[words.length - 1];
        System.arraycopy(words, 1, args, 0, args.length);
        return command.execute(args);
    }

    private static void doThis(int[] array) {
        if (123 < array.length) {
            int value = array[123];
        } else {
            // ...
        }
    }

    private static void dontDoThis(int[] array) {
        try {
            int value = array[123];
        } catch (ArrayIndexOutOfBoundsException e) {
            // ...
        }
    }
}
