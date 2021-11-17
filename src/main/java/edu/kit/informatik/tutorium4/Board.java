package edu.kit.informatik.tutorium4;

import java.util.Scanner;

/**
 * 2D Spielfeld
 * - Breite, Höhe im Konstruktor gegeben
 * - Symbole (chars) in den Zellen
 */
public class Board {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String input = scanner.nextLine();
                Command.run(input);
            }
        }

        /*Board board = new Board(50, 30);
        board.fillRect(0, 0, 25, 15, 'X');
        board.fillRect(25, 0, 25, 15, 'O');
        board.fillRect(0, 7, 25, 15, '#');
        board.fillRect(25, 7, 25, 15, '~');
        board.fillRect(15, 10, 20, 10, '.');
        board.print();*/
    }

    private final char[][] cells;
    private final int width;
    private final int height;

    public Board(int width, int height) {
        cells = new char[width][height];
        this.width = width;
        this.height = height;
    }

    public void print() {
        StringBuilder builder = new StringBuilder();

        // Zeile 0, ..., height - 1
        for (int y = 0; y < height; y++) {
            // Spalte 0, ..., width - 1
            for (int x = 0; x < width; x++) {
                builder.append(cells[x][y]);
            }

            builder.append("\n");
        }

        System.out.println(builder.toString());
    }

    public void fill(char cell) {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                cells[x][y] = cell;
            }
        }
    }

    public void fillRect(int left, int top, int width, int height, char cell) {
        for (int x = left; x < left + width; x++) {
            for (int y = top; y < top + height; y++) {
                cells[x][y] = cell;
            }
        }
    }

    public char getChar(int x, int y) {
        return cells[x][y];
    }

    public void setChar(int x, int y, char cell) {
        cells[x][y] = cell;
    }
}
