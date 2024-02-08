package testautomation;
import java.lang.*;
import java.util.Scanner;

public class SquareRootCalc {

    public static void main(String args[]){
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double squareRoot = Math.sqrt(num);
        System.out.println("Square root of " + num + " is " + squareRoot);
        sc.close();
    }
}