// Class CircularShape Implements Shape3D.
// ABSTRACT CLASS
public abstract class CircularShape  implements  Shape3D {


    private double radius;

    public CircularShape() {
        radius = 0;

    }

    public CircularShape(double r) {
        radius = r;
    }

    public double getDiameter() {
       return this.radius;
    }


    public double getRadius() {
    return  this.radius;
    }

    //area of circular shape

    public double getCrossSectionArea() {
        return Math.PI * Math.pow(radius, 2);
    }


        public double getCrossSectionPerimeter() {
            return 2 * Math.PI * radius;
        }



}


