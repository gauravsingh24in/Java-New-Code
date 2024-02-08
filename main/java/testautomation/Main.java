package testautomation;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /*System.out.printf("Hello and welcome!");   //first

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }*/

        /*int a;   //second
        int b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = scanner.nextInt();
        System.out.println("Enter the value of b");
        b = scanner.nextInt();
        int c = a + b;
        System.out.println("Sum of a and b is " + c); */

        /*int a; int b; int c; int d;   //third
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the % of Amar");
        a = scanner.nextInt();
        System.out.println("Enter the % of Akbar");
        b = scanner.nextInt();
        System.out.println("Enter the % of Anthony");
        c = scanner.nextInt();
        System.out.println("Enter the % of John");
        d = scanner.nextInt();

        scanner.close();
        if (a>b && a>c && a>d){
            System.out.println("Amar has highest percentage");
        } else if (b>a && b>d && b>c){
            System.out.println("Akbar has highest percentage");
        } else if (c>a && c>b && c>d){
            System.out.println("Anthony has highest percentage");
        } else {
            System.out.println("John has highest percentage");
        } */

        /*boolean isJavaFun = true;   //fourth
        boolean isCodingEasy = false;

        // Using logical operators
        boolean isBothFunAndEasy = isJavaFun && !isCodingEasy;
        boolean isEitherFunOrEasy = isJavaFun || isCodingEasy;

        System.out.println("Is it both fun and easy? " + isBothFunAndEasy);
        System.out.println("Is it either fun or easy? " + isEitherFunOrEasy); */

        /* int count = 1;   //fifth
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }*/

        /*Scanner scanner = new Scanner(System.in);   //sixth
        System.out.println("Enter any number greater than 0");
        int userInput = scanner.nextInt();
        scanner.close();
        int result = 0;

        for (int i = 1; i < userInput; i++) {
            result += i;
        }
        System.out.println(result);*/

        /*Scanner scanner = new Scanner(System.in);   //seventh
        System.out.println("Enter any number greater than 0");
        int userInput = scanner.nextInt();
        scanner.close();
        int result = 1;

        while (userInput > 0) {
            result *= userInput % 10;
            userInput = userInput / 10;
        }
        System.out.println(result);*/

        /*int[] myArray = new int[3];  // Declare and initialize an integer array of length 3   //eighth

        // Assign values to array elements
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;

        // Access and print an element
        System.out.println("Element at index 1: " + myArray[0]);
        System.out.println("Element at index 2: " + myArray[1]);
        System.out.println("Element at index 3: " + myArray[2]);*/

        /*int[] myArray = new int[5];  // Declare and initialize an integer array of length 5   //ninth
        System.out.println("Enter 1st number");
        Scanner scanner = new Scanner(System.in);
        myArray[0] = scanner.nextInt();
        System.out.println("Enter 2nd number");
        myArray[1] = scanner.nextInt();
        System.out.println("Enter 3rd number");
        myArray[2] = scanner.nextInt();
        System.out.println("Enter 4th number");
        myArray[3] = scanner.nextInt();
        scanner.close();

        System.out.println("Element at 1st array location: " + myArray[0]);
        System.out.println("Element at 2nd array location: " + myArray[1]);
        System.out.println("Element at 3rd array location: " + myArray[2]);
        System.out.println("Element at 4th array location: " + myArray[3]);
        System.out.println("Element at 5th array location: " + myArray[4]); */

        /*int[] myArray = new int[10];  // Declare and initialize an integer array of length 10   //tenth
        myArray[0] = 4;
        myArray[1] = 7;
        myArray[2] = 8;
        myArray[3] = 10;
        myArray[4] = 11;
        myArray[5] = 13;
        myArray[6] = 15;
        myArray[7] = 18;
        myArray[8] = 2;
        myArray[9] = 5;

        int result1 = myArray[2]*myArray[2]*myArray[2];
        int result2 = myArray[5]*myArray[5]*myArray[5];
        int result3 = myArray[8]*myArray[8]*myArray[8];
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        for (int i = 0; i < myArray.length; i += 3) {
            myArray[i] = myArray[i]*myArray[i]*myArray[i];
        }
        System.out.println(Arrays.toString(myArray));*/

        /*customMethod();   //eleventh
    }
    public static void customMethod() {
        // This is our custom method
        System.out.println("Hello from customMethod!"); */


        /*int result = add(5, 3);  // Calling the add method   //twelfth
        System.out.println("The sum is: " + result);
    }

    public static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum; */

        

    }

}