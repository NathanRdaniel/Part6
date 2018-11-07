import java.util.Scanner;
public class Pantery{
    // Instance Variables
    private Jelly  jar1 ;
    private Jelly  jar2 ;
    private Jelly  jar3 ;
    private Jelly  selected ;
  Scanner scan = new Scanner(System.in);
    // Constructors
    public Pantery( Jelly jar1, Jelly jar2, Jelly jar3 ){
      this . jar1 = jar1 ;
      this . jar2 = jar2 ;
      this . jar3 = jar3 ;
      selected = null ;
    }
  
    // Methods
    public String toString()
    {
      String str = "";
      str += "1: " +  jar1.toString()  + "\n";
      str += "2: " +  jar2.toString()  + "\n";
      str += "3: " +  jar3.toString()  + "\n";     
      return str;
    }
  
    // assume that the user entered a correct selection, 1, 2, or 3
    public void select( int jarNumber )
    {
      if ( jarNumber == 1 )
        selected =  jar1 ;
  
      else if ( jarNumber == 2 )
        selected = jar2 ;
  
      else 
        selected = jar3 ;
    }
  
    // spread the selected jam
    public void spread( int oz ){
      selected.spread( oz ) ;
    }
    public void mixedFruit(){}
  }
  