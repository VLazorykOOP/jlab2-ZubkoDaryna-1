import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius=in.nextDouble();
        System.out.println("Enter x:");
        double centerX=in.nextDouble();
        System.out.println("Enter y:");
        double centerY=in.nextDouble();

         Circle circle1=new Circle(radius,centerX, centerY);
         double getCircumference=circle1.getCircumference();
         System.out.println("Your circumference="+ getCircumference);

         double area=circle1.getArea();
         System.out.println("Area of circle="+area);

         System.out.println("Enter x for your Point");
         double pointX=in.nextDouble();
        System.out.println("Enter y for your Point");
        double pointY=in.nextDouble();

         boolean distance=circle1.containPoint(pointX,pointY);

         System.out.println("Your circle contains this Point:"+ distance);


         System.out.println("Radius for second circle");
         double radius2=in.nextDouble();
        System.out.println("Enter x for your circle");
        double xCenter=in.nextDouble();
        System.out.println("Enter y for your circle");
        double yCenter=in.nextDouble();
        Circle circle2=new Circle(radius2, xCenter, yCenter);

        int points=circle1.countIntersectingPoints(circle2);
        if (points == 2) {
            System.out.println("Circles intersect at two points.");
        } else if (points == 1) {
            System.out.println("Circles touch  at one point.");
        } else if (points == 0) {
            System.out.println("Circles are separate or one is contained within the other.");
        } else if (points == -1) {
            System.out.println("Circles coincide (completely overlap).");
        } else {
            System.out.println("Unexpected result: " + points);
        }
        in.close();
    }
}