import java.util.Scanner;
import java.util.Scanner;
public class OdiousNumbers{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a nonnegative integer:");
        long n= scan.nextLong();
        long d = n;
        long f = n;
        int i = 1;
        int count = 0;
       while(i > 0) {

        n = OdiousNumbers.divide(n);
       
       d = OdiousNumbers.remander(d);
       if(d == 1){
        count ++;
    }
    if (count == 3){
       count = count - 2;
    }
     d = n;
     

       if(n == 0){
           i = 0;
           if(count == 1 || count == 3){
               System.out.println(f + " Is Odious");
           }
           else{
            System.out.println(f + " Is evil");
           }
       }
       }
    }
    public  static long divide(long n){
        
        n = (n / 2);
       // System.out.println(n);
    
    return n;
    }
    public  static long remander(long d){
        d = (d % 2);
        System.out.println(d);
        return d;
        }
}