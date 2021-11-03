package edu.kit.informatik.tutorium2;

public class RectFromTo {
    private Int2 from;
    private Int2 to;

    public RectFromTo(final Int2 from, final Int2 to) {
        this.from = from;
        this.to = to;
    }

    public boolean contains(final Int2 point) {
        // TODO
        return false;
    }

    public int area() {
        // TODO
        return 0;
    }

    public RectFromTo normalize() {
        // TODO
        return null;
    }

    public RectCenterSize toRectCenterSize() {
        // TODO
        return null;
    }

    public Int2 getFrom() {
        return from;
    }

    public void setFrom(final Int2 from) {
        this.from = from;
    }

    public Int2 getTo() {
        return to;
    }

    public void setTo(final Int2 to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return String.format("Rectangle from %s to %s", from, to);
    }
}
