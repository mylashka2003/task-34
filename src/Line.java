public class Line {
    public double a;
    public double b;
    public double c;

    public Line(double a, double b, double c) {
        this.a = Main.round(a, 3);
        this.b = Main.round(b, 3);
        this.c = Main.round(c, 3);
    }

    public Line(double x1, double y1, double x2, double y2) {
        a = Main.round(y1 - y2, 3);
        b = Main.round(x2 - x1, 3);
        c = Main.round(x1 * y2 - x2 * y1, 3);
    }

    public Line(Point point1, Point point2) {
        a = Main.round(point1.y - point2.y, 3);
        b = Main.round(point2.x - point1.x, 3);
        c = Main.round(point1.x * point2.y - point2.x * point1.y, 3);
    }

    public double getK() {
        if (b != 0) return -a / b;
        else return Double.NaN;
    }

    public double getAngle() {
        if (Double.isNaN(this.getK())) return 90.0;
        else return Math.atan(this.getK()) * 180 / Math.PI;
    }

    public boolean isParallel(Line line) {
        return (a == 0 && line.a == 0) || (a != 0 && line.a != 0 && b / a == line.b / line.a);
    }

    public Point intersection(Line line) {
        if (this.isParallel(line)) return null;
        else if (a != 0) {
            double y = (-line.c + (line.a * c) / a) / (line.b - line.a * b / a);
            double x = (-c - b * y) / a;
            return new Point(x, y);
        } else {
            double y = (-c + (a * line.c) / line.a) / (b - a * line.b / line.a);
            double x = (-line.c - line.b * y) / line.a;
            return new Point(x, y);
        }
    }

    public Point nearPoint(Point point) {
        Line line = new Line(-b, a, b * point.x - a * point.y);
        return this.intersection(line);
    }

    public boolean oneSide(Point point1, Point point2) {
        return (a * point1.x + b * point1.y + c) * (a * point2.x + b * point2.y + c) >= 0;
    }

    @Override
    public String toString() {
        String bS; String cS;
        if (b > 0) bS = String.format(" + %.3fy", b);
        else if (b == 0) bS = "";
        else bS = String.format(" - %.3fy", -b);

        if (c > 0) cS = String.format(" + %.3f", c);
        else if (c == 0) cS = "";
        else cS = String.format(" - %.3f", -c);

        return String.format("%.3fx", a) + bS + cS + " = 0";
    }
}
