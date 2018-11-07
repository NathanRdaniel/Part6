import java.util.Scanner;
public class PasswordChecker{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Password");
        String password = scan.next();
        password = password.trim();
        int length = password.length();
        String passwordCaps = password.toUpperCase();  
        String passwordCase =  password.toLowerCase();
        int i=0;
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean numbers = false;
        boolean lengthCheck = false;
        boolean numberCheck = false;
        boolean caseCheck = false;

        for(i = 0; i < length; i++){

            if(password.charAt(i) == passwordCaps.charAt(i)){
                upperCase = true;
            }
            if(password.charAt(i) == passwordCase.charAt(i)){
                lowerCase = true;
            }  

           if(Character.isDigit(password.charAt(i)) == true){
            numbers = true;
           }
        }
        if(lowerCase = true && upperCase == true){
            caseCheck = true;
        };
        if(numbers = true){
            numberCheck = true;
        }
        if(length > 7){
            lengthCheck = true;
        }
        if(numberCheck = true && caseCheck == true){
    
            System.out.println("Password is good");
            
        }
        else{
            System.out.println("Error");
        }

    }
}