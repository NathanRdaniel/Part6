import java.lang.Math.*;
public class Cylinder{
    int height;
    int radius;
    public Cylinder(int height, int radius){
        this.height = height;
        this.radius = radius;
    }
    public int getHight(){
        return height;
    }
    public int getRadius() {
        return radius;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double area(){
        double r = radius * radius;
        double v = r * height;
       double a = Math.PI*v;
       System.out.println("Volume is: " + a);
       return a;
    }
    public double surfaceArea(){
        double r = radius * radius;
        double v1 = 2 * Math.PI*r;
        double v = radius * height;
        double v2 = 2 * Math.PI * v;
        double sa = v1 + v2;
        System.out.println("Surface area is :" + sa);
        return sa;
    }

}