/* DJ - Jason Yang, David Chen
   APCS
   HW23 -- What does Equality Look Like?
   2021-10-23
   time spent: 1.0 hours
   DISCO: Printing the object name automatically invokes the toString() method of the class.
          Math.random returns a random value between 0.0 and 1.0
   QCC: N/A
 */
          











/***
    driver for class Coin
    ~~~ SUGGESTED WORKFLOW: ~~~
    1. Compile this file and run. Note anything notable.
    2. Move the "TOP" line down, so that it is below the first statement.
    (emacs: with cursor at beginning of TOP line, C-k C-k, DOWN, DOWN, C-y)
    (your editor: ???)
    3. Compile and run again.
    4. Resolve errors one at a time until it works.
    5. Repeat 2-4 until TOP meets BOTTOM.
***/

public class Driver {

  public static void main( String[] args ) {
    Coin mine = new Coin();
    //test 1st overloaded constructor
    Coin yours = new Coin( "quarter" );
    //test 2nd overloaded constructor
    Coin wayne = new Coin( "dollar", "heads" );
    //test toString() methods of each Coin
    System.out.println("mine: " + mine);
    System.out.println("yours: " + yours);
    System.out.println("wayne: " + wayne);
    //test flip() method
    System.out.println("\nAfter flipping...");
    yours.flip();
    wayne.flip();
    System.out.println("yours: " + yours);
    System.out.println("wayne: " + wayne);
    //test equals() method
    if ( yours.equals(wayne) ) {
      System.out.println( "Match! Thou art lucky." );
    }
    else {
      System.out.println( "No match. Firestarter you can not be." );
    }



    //build Objects from blueprint specified by class Coin


    //test default constructor
    /*===================TOP==========================
      Coin mine = new Coin();
      //test 1st overloaded constructor
      Coin yours = new Coin( "quarter" );
      //test 2nd overloaded constructor
      Coin wayne = new Coin( "dollar", "heads" );
      //test toString() methods of each Coin
      System.out.println("mine: " + mine);
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);
      //test flip() method
      System.out.println("\nAfter flipping...");
      yours.flip();
      wayne.flip();
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);
      //test equals() method
      if ( yours.equals(wayne) ) {
        System.out.println( "Matchee matchee!" );
      }
      else {
        System.out.println( "No match. Firestarter you can not be." );
      }
      ====================BOTTOM======================*/

  }//end main()

}//end class
