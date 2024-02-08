package testautomation;

public class TestArray {

    public static void main(String args[]) {
        int a[] = {10, 20, 30, 40, 50};
        /*System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);*/

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

            // Calculate average of the values of Array
            float sum = 0, avg = 0;
            for (int i = 0; i < a.length; i++) {
                sum = sum + a[i];   // It can also be written as sum += a[i];
                avg = sum / a.length;
            }

            System.out.println("The sum of all array values = " + sum);
            System.out.println("The average of all array values = " + avg);
        }
    }
