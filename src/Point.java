public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = Main.round(x, 3);
        this.y = Main.round(y, 3);
    }

    @Override
    public String toString() {
        return String.format("(%.3f, %.3f)", x, y);
    }

    public double distanceToZero() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double distanceTo(Point point) {
        return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }
}
