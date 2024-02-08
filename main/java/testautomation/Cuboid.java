package testautomation;

public class Cuboid {
    double width, height, depth;
    double area(){
        double a;
        a = (width*height) + (height*depth) + (depth*width) *2;
        return a;
    }
    double volume(){
        double v;
        v = width*height*depth;
        return v;
    }
}
