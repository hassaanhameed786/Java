

public class Sphere implements Shape3D{

    private double radius;

    public Sphere()
    {
        radius = 0;
    }


    public Sphere(double r) {
       radius = r;
    }

    public double getRadius() {
       return this.radius;
    }

    public double getArea() {
        return 4.0 * Math.PI * radius * radius;
    }

    public double getVolume() {
        return 4.0 * Math.PI * Math.pow(radius, 3) / 3.0;
    }

}
