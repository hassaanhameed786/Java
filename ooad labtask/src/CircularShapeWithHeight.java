// Class CircularShapeWithHeight is a subclass of CircularShape
// ABSTRACT CLASS --> no objects
// An ABSTRACT superclass for shapes with a circular cross-section that extends over some height.
public abstract class  CircularShapeWithHeight  extends CircularShape{

    private double height;

    public CircularShapeWithHeight() {
       height = 0;
    }


    public CircularShapeWithHeight(double radius, double h) {
       super(radius);
       height = h;
    }

    public double getHeight() {
       return  this.height;
    }

}
