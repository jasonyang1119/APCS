import java.util.Scanner;

public class isTriangle {
     public static void main(String args []){
        int i = 0;
        while (i < 1){
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter the side lengths: ");
        int a = userinput.nextInt();
        int b = userinput.nextInt();
        int c = userinput.nextInt();
        if (triangleTest(a, b, c)) {
            System.out.println("It is a triangle!");
        }   else {
            System.out.println("It is not a triangle!");
        }
        }
    }
 
    public static boolean triangleTest(int a, int b, int c){
        if ( (a + b > c) && (a + c > b) && (c + b > a)) {
            return true;
        }   else {
            return false;
        }
    }
}