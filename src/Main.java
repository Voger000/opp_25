//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Point point = new Point(5.5, 10.2);
        System.out.println(point.toString());
        System.out.println(point.toSvg());

        point.translate(5, -5);
        System.out.println("translate"+point);

        Point newPoint = point.translated(-1.0, -1.0);
        System.out.println("New translated point: " + newPoint.toString());

        Segment seg = new Segment();
        seg.start = newPoint;
        seg.end = newPoint;

        seg.start.x = 1;
        seg.start.y = 2;

        seg.end.x = 2;
        seg.end.y = 3;

        System.out.println("Segment length: " + seg.length());
        Segment[] tab = new Segment[2];
        tab[0] = seg;
        tab[1] = new Segment();
        tab[1].start = newPoint;
        tab[1].end = newPoint;
        tab[1].start.x = 1;
        tab[1].start.y = 2;
        tab[1].end.x = 2;
        tab[1].end.y = 3;

        Segment longest = Segment.longestSegment(tab);
        System.out.println("Longest segment length: " + longest.length());

    }

}
