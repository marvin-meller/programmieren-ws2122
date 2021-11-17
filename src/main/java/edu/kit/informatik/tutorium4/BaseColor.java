package edu.kit.informatik.tutorium4;

public enum BaseColor {
    RED("rot"),
    GREEN("grün"),
    BLUE("blau");

    private final String german;

    BaseColor(String german) {
        this.german = german;
    }

    public String getGerman() {
        return german;
    }
}
