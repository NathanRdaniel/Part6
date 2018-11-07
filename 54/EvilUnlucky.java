import java.util.Scanner;
public class EvilUnlucky{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a nonnegative integer:");
        long n= scan.nextLong();
        long d = n;
        long f = n;
        long c = n;
        long g = n;
        int i = 1;
        int count = 0;
       while(i > 0) {

        n = EvilUnlucky.divide(n);
       
       d = EvilUnlucky.remander(d);
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
       i = 1;
       while(i > 0) {

        c = EvilUnlucky.divide(c);
        if(c == 13){
            i = 0;
            System.out.println(f + " Is unlucky.");
        }
       g = EvilUnlucky.remander(g);
     g = c;
       if(c == 0){
        System.out.println(f + " Is lucky.");
        System.out.println("Enter a nonnegative integer:");
        c= scan.nextLong();
        g= c;
        f = c;
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