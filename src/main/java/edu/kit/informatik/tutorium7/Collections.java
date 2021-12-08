package edu.kit.informatik.tutorium7;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        // List<String> names2 = new LinkedList<>();
        fillWithNames(names);

        Set<String> namesUniqueUnordered = new HashSet<>();
        fillWithNames(namesUniqueUnordered);

        Map<String, Worker> workersByName = new HashMap<>();
        workersByName.put("Max Mustermann", new Worker());
        workersByName.get("Max Mustermann");
    }

    private static void fillWithNames(Collection<String> names) {
        names.add("Max Mustermann");
        names.add("Maximiliane Musterfrau");
        names.add("Apache Helicopter");
    }

    private static <T> void reverse(List<T> list) {
        // ...
    }
}
