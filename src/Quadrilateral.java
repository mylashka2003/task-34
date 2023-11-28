import java.util.Arrays;

public class Quadrilateral {
    public Point[] points = new Point[4];

    public Quadrilateral(Point point1, Point point2, Point point3, Point point4) {

    }

    public static boolean insideTriangle(Point[] points, Point point) {
        double a = (points[0].x - point.x) * (points[1].y - points[0].y) - (points[1].x - points[0].x) * (points[0].y - point.y);
        double b = (points[1].x  - point.x) * (points[2].y - points[1].y) - (points[2].x - points[1].x) * (points[1].y - point.y);
        double c = (points[2].x  - point.x) * (points[0].y - points[2].y) - (points[0].x - points[2].x) * (points[2].y - point.y);

        return (a >= 0 && b >= 0 && c >= 0) || (a <= 0 && b <= 0 && c <= 0);
    }

    @Override
    public String toString() {
        return "Quadrilateral{" +
                "points=" + Arrays.toString(points) +
                '}';
    }
}
