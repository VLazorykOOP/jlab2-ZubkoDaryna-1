import java.util.Scanner;
import java.lang.Math;

class Point {
      private double x;
    private double y;

    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void moveX(double dx) {
        x += dx;
    }

    public void moveY(double dy) {
        y += dy;
    }

    public double distanceToOrigin() {  //теорема Піфагора
        return Math.sqrt(x * x + y * y);
    }

    public double distanceTo(Point otherPoint) {

        return Math.sqrt(Math.pow(this.x - otherPoint.x, 2) + Math.pow(this.y - otherPoint.y, 2));
    }

    public double[] toPolarCoordinates() {
        double r = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x); // арктангенс кута між лінією, яка з'єднує точку з початком координат і  піввіссю X
        return new double[]{r, theta};
    }

    public boolean equals(Point otherPoint) {
        return this.x == otherPoint.x && this.y == otherPoint.y;
    }

    public boolean notEquals(Point otherPoint) {
        return !equals(otherPoint);
    }
     public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введiть координату x: ");
        double x1 = scanner.nextDouble();

        System.out.print("Введiть координату y: ");
        double y1 = scanner.nextDouble();

       
        Point point1 = new Point(x1, y1);

        System.out.print("Введiть величину перемiщення точки 1 вздовж осi x: ");
        double dx1 = scanner.nextDouble();
        System.out.print("Введiть величину перемiщення точки 1 вздовж осi y: ");
        double dy1 = scanner.nextDouble();

    

        point1.moveX(dx1);
        point1.moveY(dy1);

      

        System.out.println("Координати точок пiсля перемiщення:");
        System.out.println("Точка 1: x = " + point1.getX() + ", y = " + point1.getY());


        // Визначення відстані від точки 1 до початку координат
        double distanceToOrigin = point1.distanceToOrigin();
        System.out.println("Вiдстань до початку координат для точки 1: " + distanceToOrigin);


        System.out.print("Введiть координату x(2) точки: ");
        double x2 = scanner.nextDouble();

        System.out.print("Введiть координату y(2) точки: ");
        double y2 = scanner.nextDouble();

                   Point point2 = new Point(x2, y2);

        double distanceBetweenPoints = point1.distanceTo(point2);
        System.out.println("Вiдстань мiж точками 1 i 2: " + distanceBetweenPoints);

        double[] polarCoordinates1 = point1.toPolarCoordinates();
        System.out.println("Полярнi координати точки 1: r = " + polarCoordinates1[0] + ", theta = " + polarCoordinates1[1]);

        boolean pointsEqual = point1.equals(point2);
        boolean pointsNotEqual = point1.notEquals(point2);
        System.out.println("Точки 1 i 2 рiвнi: " + pointsEqual);
        System.out.println("Точки 1 i 2 не рiвнi: " + pointsNotEqual);
        scanner.close();
    }
}
