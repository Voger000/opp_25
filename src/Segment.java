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

    public static Segment longestSegment(Segment[] arr) {
        if (arr.length == 0) {return null;}
        Segment max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > max.length()){
                max = arr[i];
            }
        }
        return max;
    }

}
