import java.util.Scanner;
public class Unlucky{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a nonnegative integer:");
        long n= scan.nextLong();
        long d = n;
        long f = n;
        int i = 1;
       while(i > 0) {

        n = Unlucky.divide(n);
        if(n == 13){
            i = 0;
            System.out.println(f + " Is unlucky.");
        }
       d = Unlucky.remander(d);
     d = n;
       if(n == 0){
        System.out.println(f + " Is lucky.");
        System.out.println("Enter a nonnegative integer:");
        n= scan.nextLong();
        d = n;
        f = n;
       }
       }
    }
    public  static long divide(long n){
        
        n = (n / 10);
        System.out.println(n);
    
    return n;
    }
    public  static long remander(long d){
        d = (d % 10);
        System.out.println(d);
        return d;
        }
}