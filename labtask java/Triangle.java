package com.company;

public  class Triangle {
    private double height;  // Height
    private double base;    // Base

    // constructor

    public  Triangle(double h, double b)
    {
        height = h;
        base = b;

    }

    // member functions of triangle class

    public  void setHeight(double newHeight){
        height = newHeight;

    }

    public  double getHeight( ){
        return (height);

    }

    public void setBase(double newbase){      // set baseLength
        base = newbase;
    }
    public  double getBase( ){
        return base;
    }
    public  double getArea()
    {
        return  (base * height);
    }
}