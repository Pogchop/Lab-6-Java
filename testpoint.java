package Fix;

public class testpoint {
    public static void main(String[] args) {
        Point p1 = new Point(1, 3);
        System.out.println(p1);
        Point p2 = new Point(3, 6);
        System.out.println(p2);

        p1.setX(5);
        p1.setY(9);
        System.out.println("X is " + p1.getX());
        System.out.println("Y is " + p1.getY());

        p1.setXY(5, 7);
        System.out.println(p1);
        System.out.println("X is: " + p1.getXY()[0]);
        System.out.println("Y is " + p1.getXY()[1]);

        p2.setXY(10, 11);
        System.out.printf("Distance is: %.2f%n", p1.distance(10, 11));
        System.out.printf("Distance is: %.2f%n", p1.distance(p2));
        System.out.printf("Distance is: %.2f%n", p2.distance(p1));
        System.out.printf("Distance is: %.2f%n", p2.distance());
    }
}
