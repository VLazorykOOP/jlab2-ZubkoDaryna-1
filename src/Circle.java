public class Circle {
   private double radius;
   private double centerX;
  private double centerY;
    public Circle(double radius, double centerX, double centerY){
        this.radius=radius;
        this.centerX=centerX;
        this.centerY=centerY;
    }
    public double getCircumference(){
        return  Math.PI * 2*radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    public boolean containPoint(double x, double y){
        //Distance = √((x2 -x2)² + (y2-y1)²)
        double distance = Math.sqrt(Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2));
        return distance<=radius;
    }

    public int countIntersectingPoints(Circle otherCircle) {
        double distanceBetweenCenters = Math.sqrt(Math.pow(otherCircle.centerX - centerX, 2)
                + Math.pow(otherCircle.centerY - centerY, 2));

        if (distanceBetweenCenters > radius + otherCircle.radius) {
            return 0; //відокремлені
        } else if (distanceBetweenCenters < radius -otherCircle.radius ) {
            return 0;//перше коло містить друге
        } else if (distanceBetweenCenters == 0 && radius == otherCircle.radius) {
            return -1;} //співпали
        else if (distanceBetweenCenters == radius + otherCircle.radius) {
            return 1; //зовнішній дотик
        }
        else if (distanceBetweenCenters == 0) {
            return 0; // центри збіглися, але радіуси різні
        }
        else if (distanceBetweenCenters == radius - otherCircle.radius) {
            return 1;  //внутрішній дотик
        }
        else if (distanceBetweenCenters < radius + otherCircle.radius) {
            return 2;
        }
        else {
            return 3;
        }
    }

}
