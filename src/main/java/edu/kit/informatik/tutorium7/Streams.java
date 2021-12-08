package edu.kit.informatik.tutorium7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = count(30);

        boolean anyEven = numbers.stream().allMatch(n -> n % 2 == 0);

        List<Integer> transformed = numbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .flatMap(n -> Stream.of(n - 1, n + 1))
            .collect(Collectors.toList());

        System.out.println(transformed);
    }

    private static List<Integer> count(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i ++) {
            list.add(i);
        }

        return list;
    }
}
