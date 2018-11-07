class BoxTester
{
  public static void main ( String[] args )
  {
    Box box = new  Box( 2.5, 5.0, 6.0 ) ;
    Box bigBox =  box.biggerBox(box);
    Box smallBox =  box.smallerBox(box);
    
    System.out.println( "Area: "  + smallBox.areaGetter() + " volume: " + smallBox.volumeGetter() );
    System.out.println( "sideArea: "  + smallBox.sideAreaGetter() );
    
    System.out.println( "Area: "  + bigBox.areaGetter() + " volume: " + bigBox.volumeGetter() );
    System.out.println( "sideArea: "  + bigBox.sideAreaGetter() );
    
    System.out.println( "Area: "  + box.areaGetter() + " volume: " + box.volumeGetter() );
    System.out.println( "sideArea: "  + box.sideAreaGetter() );

    box.nesting(bigBox, smallBox);
    box.nesting(box, smallBox);
    box.nesting(bigBox, box);
    box.nesting(smallBox, bigBox);
  }
  
  
}