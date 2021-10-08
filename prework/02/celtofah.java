import java.util.Scanner;

public class celtofah{
    public static void main(String args[]){
        double celsius;
        double fahrenheit;
        double roundedfahrenheit;
        Scanner keyboardinput = new Scanner(System.in);
        System.out.print("Temperature in Celsius? ");
        celsius = keyboardinput.nextDouble();
        fahrenheit = celsius * 1.8 + 32.0;
        roundedfahrenheit = Math.round(fahrenheit * 100)/100.0;
     
        System.out.println(celsius + " degrees Celsius is equal to " + roundedfahrenheit + " degrees Fahrenheit.");
    }
}