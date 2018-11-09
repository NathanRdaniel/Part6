
public class Unlucky{
    public static void main(String args[]) {
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
               }else(num == 0){
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
    
