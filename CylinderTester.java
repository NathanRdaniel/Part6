import java.util.Scanner;
public class CylinderTester{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Radius:");
        int r = scan.nextInt();
        System.out.println("Enter Height:");
        int h = scan.nextInt();
        Cylinder c1 = new Cylinder(h , r);
        c1.area();
        c1.surfaceArea();
    }
}