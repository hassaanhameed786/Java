package com.company;

public class Calculation {

        int x;
        public  void  addition (int y, int z){
            x = y + z;
            System.out.println("the sum of x + y = " + x);
        }

        public  void  Subtraction(int y , int z) {
            x = y-z;

            System.out.println("the subtraction of x - y = " + x);

        }

        public static class  My_calculation extends  Calculation {

            public void Multiplication(int y, int z) {
                x = y * z;
                System.out.println("the multiplication of x  * y = " + x);

            }

            public void Division(int y, int z) {
                x = y / z;
                System.out.println("the division of x / y = " + x);

            }

            public static void main(String args[]) {

                My_calculation obj1 = new My_calculation();
                obj1.Division(100, 10);
                obj1.addition(10, 11);
                obj1.Subtraction(11, 17);
                obj1.Multiplication(2,6);


            }

        }
}
