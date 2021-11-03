package edu.kit.informatik.tutorium2;

public class Int2 {
    private int x;
    private int y;

    public Int2(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public void add(final Int2 xy) {
        // TODO
    }

    public void multiply(final double factor) {
        // TODO
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
