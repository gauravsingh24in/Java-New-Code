package testautomation;
import java.util.Scanner;

public class Comparator {
    public static void main(String args[]) {
        System.out.println("Please enter first number");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Please enter second number");
        int num2 = sc.nextInt();
        sc.close();
        if (num1 > num2) {
            System.out.println("First number " + num1 + " is greater than second number " + num2);
        } else {
            System.out.println("Second number " + num2 + " is greater than first number " + num1);
        }
    }
}
