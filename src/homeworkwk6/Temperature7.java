package homeworkwk6;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

public class Temperature7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         float temp;
        System.out.println("Enter the Temperature ");
          temp = scanner.nextFloat();
         temp = ((temp-32) * 5)/9;
        System.out.println("Celsius Temperature is " + temp);

        scanner.close();

    }
}
