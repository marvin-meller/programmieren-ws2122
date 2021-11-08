package edu.kit.informatik.tutorium2;

// Klassen sind Baupläne für Objekte (z.B. "Mensch", "Auto").
// Objekte sind Instanzen von Klassen (z.B. "Max (geb. 1978)", "der BMW da drüben").
// Klassen (Objekte) haben Konstruktoren, Attribute und Methoden.
public class Int2 {
    // Attribute sind wie Variablen auf Objektebene.
    // Sie entsprechen etwa dem Speicher des Computers (oder auch dem Raum).
    // Attribute immer als privat markieren.
    private int x;
    private int y;

    // Konstruktoren sind wie Methoden auf Klassenebene, die ein neues Objekt der Klasse erstellen.
    // Konstruktoren müssen gleich wie die Klasse heißen und der Rückgabetyp wird nicht extra engegeben.
    public Int2(final int x, final int y) {
        // Mit this kann zwischen Attributen und Parametern mit gleichem Namen differenziert werden.
        this.x = x;
        this.y = y;
    }

    // Methoden sind Ausführbare "Miniprogramme" auf Objektebene.
    // Sie entsprechen etwa dem Prozessor des Computers (oder auch der Zeit).
    public void add(final Int2 xy) {
        this.x += xy.x;
        this.y += xy.y;
    }

    public void multiply(final double factor) {
        x *= factor;
        y *= factor;
    }

    public int getX() {
        return x;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(final int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
