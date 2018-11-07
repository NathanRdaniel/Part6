import java.util.Scanner;
public class EvilUnlucky{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a nonnegative integer:");
        long num= scan.nextLong();
        long remander = num;
        long original = num;
        long work = num;
        long g = num;
        int i = 1;
        int count = 0;
       while(i > 0) {

        num = EvilUnlucky.divide(n);
       
       remander = EvilUnlucky.remander(remander);
       if(remander == 1){
        count ++;
    }
    if (count == 3){
       count = count - 2;
    }
     remander = num;
     

       if(n == 0){
           i = 0;
           if(count == 1 || count == 3){
               System.out.println(original + " Is Odious");
           }
           else{
            System.out.println(original + " Is evil");
           }
       }
       }
       i = 1;
       while(i > 0) {

        work = EvilUnlucky.divide(c);
        if(work == 13){
            i = 0;
            System.out.println(original + " Is unlucky.");
        }
       g = EvilUnlucky.remander(g);
     g = c;
       if(c == 0){
        System.out.println(f + " Is lucky.");
        System.out.println("Enter a nonnegative integer:");
        c= scan.nextLong();
        g= c;
        original = c;
       }
       }
    }
    public  static long divide(long num){
        
        num = (num / 2);
       // System.out.println(n);
    
    return num;
    }
    public  static long remander(long remander){
        remander = (remander % 2);
        System.out.println(remander);
        return remander;
        }
}
