
import java.util.Scanner;

class Circle{
    private double radius;
    private double centerX;
    private double centerY;


public Circle(double radius, double centerX, double centerY){
    this.radius=radius;
    this.centerX=centerX;
    this.centerY=centerY;
}
public double getCircumference(){ //Circumference-довжина кола
    return 2*Math.PI*radius;
}
public double getArea(){
    return Math.PI*Math.pow(radius,2);
}
public boolean containsPoint(double x,double y){
 double dictance=Math.pow(Math.pow(x-centerX, 2), Math.pow(y-centerY, 2));
  return dictance <= radius;
}
    public int countIntersectingPoints(Circle otherCircle) {
        double distanceBetweenCenters = Math.sqrt(Math.pow(otherCircle.centerX - centerX, 2)
                + Math.pow(otherCircle.centerY - centerY, 2));

        if (distanceBetweenCenters >= radius + otherCircle.radius) {
            return 0;
        } else if (distanceBetweenCenters + otherCircle.radius <= radius) {
            return 0;
        } else if (distanceBetweenCenters <= Math.abs(radius - otherCircle.radius)) {
            return 0;}
         else if (distanceBetweenCenters == radius + otherCircle.radius) {
        return 1;
    }
        else {
            return 2;
        }
    }
}
public class Second {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         System.out.print("Введіть радіус першого кола: ");
        double radius1 = scanner.nextDouble();
        System.out.print("Введіть координату X центра першого кола: ");
        double centerX1 = scanner.nextDouble();
        System.out.print("Введіть координату Y центра першого кола: ");
        double centerY1 = scanner.nextDouble();

             Circle circle1 = new Circle(radius1, centerX1, centerY1);

     
         double getCircumference = circle1.getCircumference();
        double area1 = circle1.getArea();
        System.out.println("Довжина кола для першого кола: " + getCircumference);
        System.out.println("Площа круга для першого кола: " + area1);       

        System.out.print("Введіть координату X точки: ");
        double pointX = scanner.nextDouble();
        System.out.print("Введіть координату Y точки: ");
        double pointY = scanner.nextDouble();

        // Перевірка, чи точка належить першому колу
        boolean pointInCircle1 = circle1.containsPoint(pointX, pointY);

        System.out.println("Точка (" + pointX + ", " + pointY + ") належить першому колу: " + pointInCircle1);
       System.out.print("Введіть радіус другого кола: ");
        double radius2 = scanner.nextDouble();
        System.out.print("Введіть координату X центра другого кола: ");
        double centerX2 = scanner.nextDouble();
        System.out.print("Введіть координату Y центра другого кола: ");
        double centerY2 = scanner.nextDouble();

           Circle circle2 = new Circle(radius2, centerX2, centerY2);

        int intersectionPoints = circle1.countIntersectingPoints(circle2);
        System.out.println("Кількість точок перетину з другим колом: " + intersectionPoints);
        
        scanner.close();

    }

}

