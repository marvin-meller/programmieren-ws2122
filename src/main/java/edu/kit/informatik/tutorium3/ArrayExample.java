package edu.kit.informatik.tutorium3;

import edu.kit.informatik.tutorium2.Main;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayExample {
    public static void main(String[] args) {
        int[] squares = Main.squares(10);
        System.out.println(Arrays.stream(squares).mapToObj(Integer::toString).collect(Collectors.joining("\n")));
        System.out.println(Arrays.toString(squares));
    }
}
