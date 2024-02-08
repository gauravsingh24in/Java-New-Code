package testautomation;
import java.util.ArrayList;
import java.util.Scanner;

public class SimpleArrayList {
    public static void main(String args[]){
        int sum = 0;
        float avg = 0;
        ArrayList <Integer> aL = new ArrayList<Integer>();
        System.out.println("Enter the input numbers, enter 0 to stop");
        Scanner input = new Scanner(System.in);
        while (!input.equals('0')){
            aL.add(input.nextInt());
        }
        if (aL.equals('0')) {
                for (int i = 0; i < aL.size(); i++) {
                sum = sum + aL.get(i);
            }
            avg = sum / aL.size();
            System.out.println("Average:" + avg);
        }
    }
}
