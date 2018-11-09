import java.util.Scanner;

public class EvilUnlucky{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a nonnegative integer:");
        long num= scan.nextLong();
        long numUn;
        boolean isEvil;
        boolean isUnlucky;
        int i = 1;
        while(i > 0) {
            isEvil = EvilUnlucky.OdiousNumbers(num);
            isUnlucky = EvilUnlucky.Unlucky(numUn);

            if(isEvil = true && isUnlucky == true){
                 System.out.println("Is Evil & Unlucky.");
                 System.out.println("Enter a nonnegative integer:");
                 num= scan.nextLong();
             }else{
                 System.out.println("Is NOT Evil & Unlucky.");
                 System.out.println("Enter a nonnegative integer:");
                 num= scan.nextLong();
            }
            if(num < 0){
                i = 0;
            }
        }
    }
    public static Boolean odiousNumbers(Long num) {
        long digit = num;
        int i = 1;
        int count = 0;
        Boolean isodious;
       while(i > 0) {

        num = OdiousNumbers.divide2(num);
       
       digit = OdiousNumbers.remander2(digit);
       if(digit == 1){
        count ++;
    }
    if (count == 3){
       count = count - 2;
    }
     digit = num;
     

       if(num == 0){
           i = 0;
           if(count == 1 || count == 3){
                isodious = true;   
                return isodious;
           }
           else{
            isodious = false;   
            return isodious;
           }
       }
       }
    }
    public  static long divide2(long num){
        
        num = (num / 2);
       // System.out.println(n);
    
    return num;
    }
    public  s long remander2(long digit){
        digit = (digit % 2);
        System.out.println(digit);
        return digit;
    }
public static boolean Unlucky(long num) {
    long digit = num;
    long remander = 0;
    int i = 1;
    Boolean isUnlucky;
    while(i > 0) {

        num = Unlucky.divide(num);
       
       digit = Unlucky.remander(digit);
        
     

       if(digit == 1 && remander == 3 ){
           i = 0;
                isUnlucky = true;  
                return isUnlucky;
           }else if(num == 0){
            i = 0;
            isUnlucky = false; 
        }
       remander = digit;
       digit = num;
       }
    }
    public  static long divide(long num){
        
        num = (num / 10);
       // System.out.println(n);
    
    return num;
    }
    public  static long remander(long digit){
        digit = (digit % 10);
        System.out.println(digit);
        return digit;
    }

}