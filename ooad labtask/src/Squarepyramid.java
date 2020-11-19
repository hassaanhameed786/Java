// Represents a pyramid with a square as its base.
public class Squarepyramid implements Shape3D {



    private double length;
    private double height;
    private double width;

    //default constructor
    public Squarepyramid() {
        length = 0;
        height = 0;
        width =0;
    }

    public  double getLength(){
        return this.length;
    }
    public  Squarepyramid(double l, double h){
        length = l;
        height = h;
    }

    public double getHeight(){
        return  this.height;
    }

    public  double getWidth() { return  this.width;}


    //@Override
    public double getArea() {
        return 2 * ((width * length) + (height * length ) + height * (width));
    }

    //@Override
    public double getVolume() {
        return length * length * height;
    }
}
