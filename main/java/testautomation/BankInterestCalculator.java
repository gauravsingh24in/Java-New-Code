package testautomation;
import java.util.Scanner;

class BankIntCalc {
    int p, r, t;
    int interest(){
        return (p*r*t)/100;
    }
}
public class BankInterestCalculator {
    public static void main(String args[]) {
        BankIntCalc bit = new BankIntCalc();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter principal amount");
        bit.p = sc.nextInt();
        System.out.println("Please enter yearly rate of interest");
        bit.r = sc.nextInt();
        System.out.println("Please enter time in months");
        bit.t = sc.nextInt();
        System.out.println("Yearly interest on deposit is " + bit.interest());
    }
}
