// Class Cylinder, subclass of CircularShapeWithHeight
// Represents a cylinder shape.
public class Cylinder  extends  CircularShapeWithHeight{

    public Cylinder() {
        System.out.println("Constructor of Cylinder");
    }


    public Cylinder(double radius, double height) {
       super(radius, height);
    }

    public double getArea() {
        return getCrossSectionPerimeter() * getHeight() + 2 * getCrossSectionArea();
    }

    public double getVolume() {
        return getCrossSectionArea() * getHeight();
    }


}

