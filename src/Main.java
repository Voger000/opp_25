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

    }
}