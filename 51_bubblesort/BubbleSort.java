// Java Coffee- Courtney Huang, Yuki Feng, Jason Yang
// APCS pd 07
// HW51 -- implementing bubblesort
// 2022-01-04t
// time spent: .5 hrs

/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 *
 * ALGO:
    - Starting from right, compare adjacent elements and switch them if the left element is greater than the right.
    - Repeat this until all the elements are compared (when it reaches the very left of arry)
    - Keep on repeating this n-1 times where n is number of elements in arry.
 *
 * DISCO
 *            
 * QCC
 * q0: If a pass requires no swaps, what do you know?
 * a0: The array is already in correct order.
 * q1: After pass p, what do you know?
 * a1: p elements starting on the left are in order.
 * q2: How many passes are necessary to completely sort?
 * a2: n-1? n being size of array
 *
 ******************************/

import java.util.ArrayList;

public class BubbleSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond:  lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubbleSortV( ArrayList<Comparable> data )
  {
    /* YOUR IMPLEMENTATION HERE */
    for (int pass = 0; pass < data.size(); pass++) {
           for (int index = data.size() - 1; index > pass; index--) {
               if (data.get(index).compareTo(data.get(index - 1)) == -1) {
                   Comparable tempor = data.get(index);
                   data.set(index, data.get(index - 1));
                   data.set(index - 1, tempor);
                 }
          }
      }
}


  // ArrayList-returning bubbleSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
  {
    ArrayList<Comparable> retAL = new ArrayList<Comparable>();
       for (int i = 0; i < input.size(); i++) {
           retAL.add(input.get(i));
       }
       bubbleSortV(retAL);
       return retAL;
   }


  public static void main( String [] args )
  {
      ArrayList glen = new ArrayList<Integer>();
        glen.add(7);
        glen.add(1);
        glen.add(5);
        glen.add(12);
        glen.add(3);
        System.out.println("ArrayList glen before sorting:\n" + glen);
        bubbleSortV(glen);
        System.out.println("ArrayList glen after sorting:\n" + glen);

        ArrayList coco = populate(10, 1, 1000);
        System.out.println("ArrayList coco before sorting:\n" + coco);
        bubbleSortV(coco);
        System.out.println("ArrayList coco after sorting:\n" + coco);



        glen = new ArrayList<Integer>();
        glen.add(7);
        glen.add(1);
        glen.add(5);
        glen.add(12);
        glen.add(3);
        System.out.println("ArrayList glen before sorting:\n" + glen);
        ArrayList glenSorted = bubbleSort(glen);
        System.out.println("sorted version of ArrayList glen:\n"
                + glenSorted);
        System.out.println("ArrayList glen after sorting:\n" + glen);


        coco = populate(10, 1, 1000);
        System.out.println("ArrayList coco before sorting:\n" + coco);
        ArrayList cocoSorted = bubbleSort(coco);
        System.out.println("sorted version of ArrayList coco:\n"
                + cocoSorted);
        System.out.println("ArrayList coco after sorting:\n" + coco);
  }//end main

}//end class BubbleSort
