package Method_Overloading;

public class Calculator {

    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }

    int area(int length){
        return length*length;
    }

    int area(int length, int width){
        return length*width;
    }

    float area(float radius){
        return (float) Math.PI*radius*radius;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println("Sum of two integer numbers: "+c.add(5, 4));
        System.out.println("Sum of three integer numbers: "+c.add(2, 3, 7));
        System.out.println("Sum of two decimal numbers: "+c.add(4.56, 3.21));
        System.out.println();
        System.out.println("Area of Square: "+c.area(5));
        System.out.println("Area of Rectangle: "+c.area(8, 4));
        System.out.println("Area of Circle: "+c.area(6.25f));
    }
}
