import java.util.Scanner;
public class PanteryTester{
    public static void main ( String[] args ){
    int i = 1;
    int rep = 12;
    Jelly goose = new Jelly( "Gooseberry", "7/4/86", rep );
    Jelly apple = new Jelly( "Crab Apple", "9/30/99", rep );
    Jelly rhub  = new Jelly( "Rhubarb", "10/31/99", rep );
    Scanner scan = new Scanner(System.in);
    Pantery hubbard = new Pantery( goose, apple, rhub );
    while(i == 1){
      
        System.out.println( hubbard );
        System.out.println("Enter Your Selection:");
        int selection = scan.nextInt();
        if(selection >= 1 && selection <= 3){
            hubbard.select(selection);
            System.out.println("Enter Amount of Spread:");
            int spread = scan.nextInt();
            hubbard.spread(spread);
            //if(){
            hubbard.replaceContent();
            
        }
        if(selection < 0){
            i = 0;
            System.out.println("Have a good Day");
        }
        if(selection > 3){
            i = 0;
            System.out.println("Error: Over Jam Selection Limit");
            System.out.println("Have a good Day");
        }
    
     
      }
    
    }
  }