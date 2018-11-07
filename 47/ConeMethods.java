import java.util.Scanner;
public class ConeMethods{
    public static void main(String[] args) {
        input();
    }
        public static void input(){     Scanner scan = new Scanner(System.in);
            System.out.println("Enter Radius:");
            int r = scan.nextInt();
            System.out.println("Enter Height:");
            int h = scan.nextInt();
            double s = 0;
            double a = 0;
            slantHeight(r, h, s);
            angle(r, h, a);
        }
   
       
    public static double slantHeight(int r, int h, double s){
        int slh = (r * 2) + (h * 2);
       s = Math.sqrt(slh);
       System.out.println("slant hight of cone: "+s);
       return s;
    }
    public static double angle(int r, int h, double a){
        double angle = r/h;
       a =  Math.atan(angle);
       System.out.println("Angle of cone: " + a);
       return a;
   }
}