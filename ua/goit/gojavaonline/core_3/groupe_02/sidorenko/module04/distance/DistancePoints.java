package ua.goit.gojavaonline.core_3.groupe_02.sidorenko.module04.distance;

public class DistancePoints {
    public static double distance(Point a, Point b) {
    return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
}


    public static void main(String[] args) {
        Point a = new Point(5, 2);
        Point b = new Point(10, 20);

        System.out.println(String.format("Distance between a(%.2f:%.2f) and b(%.2f:%.2f) = %.2f", a.getX(), a.getY(), b.getX(), b.getY(), DistancePoints.distance(a, b)));

        a = new Point(1, 2);
        b = new Point(3, 4);

        System.out.println(String.format("Distance between a(%.2f:%.2f) and b(%.2f:%.2f) = %.2f", a.getX(), a.getY(), b.getX(), b.getY(), DistancePoints.distance(a, b)));
    }

}

