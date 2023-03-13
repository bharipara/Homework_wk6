package homeworkwk6;

import java.util.Scanner;

/**
 * 16. Write a Java program to add two binary numbers.
 *
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 *
 * Sum of two binary numbers: 101
 */

public class BinaryNumbers16 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter 1st binary number : ");
        String x = num.next();

        System.out.println("Enter 2nd binary number : ");
        String y = num.next();

        int n1 = Integer.parseInt(x,2);
        int n2 = Integer.parseInt(y, 2);
        int n3 = n1+n2;

        System.out.println("n3 =n1+n2 : " +Integer.toBinaryString(n3));
    }


}
