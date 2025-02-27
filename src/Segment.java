public class Segment {
    public Point start;
    public Point end;

    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Segment() {

    }

    public double length() {
        return Math.sqrt(Math.pow(end.x - start.x, 2) + Math.pow(end.y - start.y, 2));
    }

}
