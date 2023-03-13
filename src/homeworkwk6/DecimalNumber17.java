package homeworkwk6;

import java.util.Scanner;

/**
 * 17. Write a Java program to convert a decimal number to binary number.
 *
 *         Input Data:
 *         Input a Decimal Number : 5
 *         Expected Output
 *
 *         Binary number is: 101
 */

public class DecimalNumber17 {

    public static void main(String[] args) {
        int decimal,binary;
        int a = 5;
        Scanner dec = new Scanner(System.in);
        System.out.println("Input a Decimal Number :");
        decimal = dec.nextInt();
        System.out.println("Binary number is :" + Integer.toBinaryString(5));

        dec.close();
    }

}
