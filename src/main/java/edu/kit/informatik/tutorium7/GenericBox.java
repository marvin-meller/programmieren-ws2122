package edu.kit.informatik.tutorium7;

public class GenericBox<T> {
    public static void main(String[] args) {
        GenericBox<Integer> box1 = new GenericBox<>(3);
        GenericBox<String> box2 = new GenericBox<>("hello");
        int value1 = box1.getValue();
        // Error, must be a String
        // box2.setValue(5);
    }

    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
