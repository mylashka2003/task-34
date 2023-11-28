public class Main {
    public static void main(String[] args) {
        /* Point a = new Point(1, 1);
        Point b = new Point(2, 0);

        Point c = new Point(2, 0);
        Point d = new Point(1, 1);

        Line line = new Line(a, b);
        Line line2 = new Line(c, d);
        System.out.println(line + " ||| " + line2);

        System.out.println(line.getAngle() + " " + line.getK());
        System.out.println(line2.getAngle() + " " + line2.getK()); */

        Point a = new Point(0.613, -0.968);
        Point b = new Point(-2.923, 1.154);
        Point c = new Point(-1.357, 4.286);
        Point o = new Point(0, 0.6664);

        Point[] arr = new Point[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;

        System.out.println(Quadrilateral.insideTriangle(arr, o));
    }

    public static double round(double n, int digits) {
        return Math.round(n * (int) (Math.pow(10, digits))) / Math.pow(10, digits);
    }
}
