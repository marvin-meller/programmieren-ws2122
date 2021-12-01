package edu.kit.informatik.tutorium6;

public class Collections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hallo");
        String value = list.get(0);
    }

    public static void equivalent() {
        List list = new ArrayList();
        list.add((String) "hallo");
        String value = (String) list.get(0);
    }
}

interface List<T> {
    void add(T value);

    T get(int index);

    // ...get, remove, clear
}

class ArrayList<T> implements List<T> {
    private final Object[] array = new Object[8];

    @Override
    public void add(T value) {
        // Copy array if necessary, insert value at end
    }

    @Override
    public T get(int index) {
        return null;
    }
}

class LinkedList implements List {
    @Override
    public void add(Object value) {
        // Get last node, insert value after it
    }

    @Override
    public Object get(int index) {
        return null;
    }
}