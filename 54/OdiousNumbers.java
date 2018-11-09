
public class OdiousNumbers{
    public static Boolean odiousNumbers(Long num) {
        long digit = num;
        int i = 1;
        int count = 0;
        Boolean isodious;
       while(i > 0) {

        num = OdiousNumbers.divide(num);
       
       digit = OdiousNumbers.remander(digit);
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
    public  static long divide(long num){
        
        num = (num / 2);
       // System.out.println(n);
    
    return num;
    }
    public  static long remander(long digit){
        digit = (digit % 2);
        System.out.println(digit);
        return digit;
    }
}
}