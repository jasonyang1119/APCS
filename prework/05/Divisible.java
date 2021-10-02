import java.util.Scanner;

public class Divisible {

	public static void main(String args []){
        int c = 0;
        while (c < 1){
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int a = userinput.nextInt();
        Scanner userinput2 = new Scanner(System.in);
        System.out.print("Enter the divisor: ");
        int b = userinput2.nextInt();
        isDivisible(a, b);
        }
    }

    public static void isDivisible(int a, int b){
        if (a % b == 0) {
            System.out.println("Evenly divisible");
            System.out.println("  ");
        }   else {
            System.out.println("Not evenly divisible");
            System.out.println("  ");

        }
    }
}