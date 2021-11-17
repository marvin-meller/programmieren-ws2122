package edu.kit.informatik.tutorium3;

import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String input = scanner.nextLine();

                if (input.equals("quit")) {
                    break;
                }

                double number;

                try {
                    number = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    System.out.println("Ungültige Eingabe");
                    continue;
                }

                System.out.println(Math.sqrt(number));
            }
        }
    }
}
