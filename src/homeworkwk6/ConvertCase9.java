package homeworkwk6;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */

public class ConvertCase9 {
    public static void main(String[] args) {
        Scanner con =new Scanner(System.in);
        System.out.println("Input a String : ");
        String line = con.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
    }
}
