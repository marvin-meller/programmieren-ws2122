package edu.kit.informatik.tutorium2;

public class RectFromTo {
    private Int2 from;
    private Int2 to;

    public RectFromTo(final Int2 from, final Int2 to) {
        this.from = from;
        this.to = to;
    }

    public boolean contains(final Int2 point) {
        // final macht, dass der Variable kein neuer Wert mehr zugewiesen werden kann.
        // Der zugewiesene Wert kann intern ggf. immer noch mutiert werden!
        final RectFromTo normalized = normalize();
        return point.getX() >= normalized.from.getX() && point.getX() <= normalized.to.getX() &&
            point.getY() >= normalized.from.getY() && point.getY() <= normalized.to.getY();
    }

    public int area() {
        return Math.abs(to.getX() - from.getX()) * Math.abs(to.getY() * from.getY());
    }

    public RectFromTo normalize() {
        return new RectFromTo(
            new Int2(Math.min(from.getX(), to.getX()), Math.min(from.getY(), to.getY())),
            new Int2(Math.max(from.getX(), to.getX()), Math.max(from.getY(), to.getY()))
        );
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
