public class Box{
    private  double width;
    private double height;
    private double length;
    private boolean nesting;
    private boolean nestingLength;
    private boolean nestingHeight;
    private boolean nestingWidth;
    public Box(double width, double height, double length){
this.height = height;
this.width = width;
this.length = length;
    }
    Box( Box oldBox ){}
    public Box biggerBox( Box box ){
        return new Box( 1.25*box.width(),1.25*box.height(),1.25*box.length());
}
public Box smallerBox( Box box ){
    return new Box( 0.75 *box.width(), 0.75*box.height(), 0.75*box.length());
}
   // public Box ( double side ){}
    public double length(){
        return length;
    }
    public double height(){
        return height;
    }
    public double width(){
        return width;
    }
    public double sideAreaGetter(){
        return sideArea();
    }
    public double topAreaGetter(){
        return topArea();
    }
    public double faceAreaGetter(){
        return sideArea();
    }
    public double areaGetter(){
        return area();
    }
    public double volumeGetter(){
        return volume();
    }
    //---------------------


    private double volume(){
        double volume = width * height * length;
        return volume;
    }

    private double area(){
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea() ;
    }
    private double faceArea(){
        double faceArea = length() * height();
        return faceArea;
    }
    private double topArea(){
        double topArea = width() * length();
        return topArea;
    }
    private double sideArea(){
        double sideArea = length() * height();
        return sideArea;
    }
   
    public boolean nesting(Box bigBox, Box smallBox){
        if(bigBox.length() > smallBox.length()){
           nestingLength= true;
        }else{
            nestingLength= false;
        }
        if(bigBox.height() > smallBox.height()){
            nestingHeight= true;
        }else{
            nestingHeight= false;
        }
        if(bigBox.width() > smallBox.width()){
            nestingWidth= true;
        }else{
            nestingWidth= false;
        }
        
        if(this.nestingHeight == true && this.nestingWidth == true){
            System.out.println(" Box can fit ");
        }else{
            System.out.println(" Box wont fit ");
        }
        return nesting;
    }
    /*
          E1
      ----------  
      Never compiled because Box() is private and needs to be public 
    in order to  get the methods and data types. 
      private Box(double width, double height, double length){
          E2
      ----------
        the method area() was never used inside the program making it spit an error 
    when it was bring called from a difrent class & because it was private it never could be
    called for in BoxTester
     private double area(){
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea() ;

    */


}