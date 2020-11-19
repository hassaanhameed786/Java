// Class RectangularPrism  Implements Shape3D
/// three-dimensional rectangular shape
public class RectangularPrism  implements  Shape3D{


    private double length;
    private double width;
    private double height;


    public RectangularPrism() {
       length = 0;
       width =  0;
       height = 0;
    }

    public RectangularPrism(double l, double w, double h) {
       length = l;
       width  = w;
       height = h;
    }


    public double getLength() {
       return  this.length;
    }


    public double getWidth() {
       return  this.width;
    }

    public double getHeight() {
       return  this.height;
    }

    public double getArea() {
        return 2 * (width * length + height * length + height * width);
    }

    public double getVolume() {
        return length * length * height;
    }


}
