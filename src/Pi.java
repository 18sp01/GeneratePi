/**
 * Created by Sang Won on 7/25/2018.
 */
import java.lang.Math;
import java.util.Scanner;

public class Pi {

    static String pi = String.valueOf(Math.PI);

    public static String returnPi (int numOfDigits) {
        return pi.substring(0,numOfDigits+2);
    }

    public static void main (String[] args) {
        System.out.println("How many digits of Pi do you want?");
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        System.out.println(returnPi(n));
    }

}
