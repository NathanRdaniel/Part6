import java.util.Scanner;
public class NameEcho{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();
        String nameFixed;
        nameFixed = name.trim();
        int length = nameFixed.length();
        int space = nameFixed.indexOf(" "); 
        String lastname = nameFixed.substring(space, nameFixed.length());
        String firstname = nameFixed.substring( 0 , space);
        String caps = lastname.toUpperCase();
        String nameFinished = firstname  + caps;
  
        System.out.println(nameFinished);   
        
    }
}