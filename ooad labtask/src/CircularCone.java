// Class CircularCone is a subclass of CircularShapeWithHeight
// Represents cones with a circular base.
public class CircularCone  extends  CircularShapeWithHeight{

    public CircularCone() {
        System.out.println("Constructor of CircularCone");
    }

    public CircularCone(double radius, double height) {
       super(radius,height);
    }

    public double getArea() {
        double r = getRadius();
        double h = getHeight();
        return Math.PI * r * (r + Math.sqrt(r * r + h * h));
    }

    public double getVolume() {
        return getCrossSectionArea() * getHeight() / 3.0;
    }

}
