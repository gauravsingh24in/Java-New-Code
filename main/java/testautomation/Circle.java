package testautomation;

public class Circle {
    double r;
    double circumference(){
        return 2*3.14159*r;
    }
    double area(){
        return 3.14159*r*r;
    }
    void setCircleParams(double radius){   // Creating method with parameters and using it in circle c1
        r = radius;
    }

    /*Circle (double newRadius){      // Creating Constructor and using in circle c3
        r = newRadius;
    }*/

    Circle (double r){       // Creating Constructor with "this" keyword of Java and using in circle c4
        this.r = r;          // Either coding style of c3 or c4 can be used at a time
    }
    public static void main(String args[]){
        /*Circle c1 = new Circle();
        c1.setCircleParams(15);
        System.out.println("Area of circle is " + c1.area());
        System.out.println("Circumference of circle is " + c1.circumference());

        Circle c2 = new Circle();     // Normally passing radius value
        c2.r = 15;
        System.out.println("Area of circle is " + c2.area());
        System.out.println("Circumference of circle is " + c2.circumference());

        /*Circle c3 = new Circle(15);
        System.out.println("Area of circle is " + c3.area());
        System.out.println("Circumference of circle is " + c3.circumference());*/

        Circle c4 = new Circle(15);
        System.out.println("Area of circle is " + c4.area());
        System.out.println("Circumference of circle is " + c4.circumference());
    }
}
