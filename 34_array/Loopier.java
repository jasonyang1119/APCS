/**
Java Coffee: Yuki Feng, Courtney Huang, Jason Yang
APCS
HW34 -- A Pirate's life for Me // using arrays
2021-11-13
time spent: 
DISCO
- You can't use parenthesis after .length of an array
- You have to declare a static array if you want the methods to work on a preexisting array
QCC
- 
- 
**/


import java.util.Random;

public class Loopier {
    
    static int[] arrayTest;

    public static int[] populateArray (int size){
        Random random = new Random();
        arrayTest = new int[size];
        for (int i = 0; i < arrayTest.length; i++) {
        arrayTest[i] = random.nextInt(100);
    }
    return arrayTest;
} ///populates an array with random ints


    public static String arrayToString(int [] arrayName) {
        String begin = "{";
        for (int i = 0; i < arrayName.length - 1 ; i++){
            begin = begin + arrayName[i] + ",";
        }
        return begin + arrayName [arrayName.length - 1] +  "}";
    } /// converts the array to a string
    
    
     public static int linSearch( int[] a, int target ){
         for (int i = 0; i < a.length; i++){
             if (a[i] == target){
                 return i;
             }
         }
         return -1;
     } /// finds the first occurance of an integer in the array using interation
     
     
      public static int linSearchR( int[] a, int target ){
          return -1;
      } /// finds the first occurance of an integer in the array using recursion
      
      
      public static int freq( int[] a, int target ){
          int answer = 0;
          for (int i = 0; i < a.length; i++){
              if (a[i] == target){
                  answer = answer + 1;
              }
          }
          return answer;
      } /// finds frequency of a target in the array using iteration
      
      
       public static int freqRec( int[] a, int target ){
           return -1;
       } /// finds frequency of a traget in the array using recursion
     
   
     
    
    
    

   
    public static void main(String [] args){
        populateArray(15);
        System.out.println("Array in string format is: " + arrayToString(arrayTest));
        System.out.println("Index of target number is: " + linSearch(arrayTest, 10));
        /// System.out.println("Index of target number is: " + linSearchr(arrayTest, 10));
        System.out.println("Frequency of target number is: " + freq(arrayTest, 10));
        ///System.out.println("Frequency of target number is: " + freq(arrayTest, 10));
    }
}
