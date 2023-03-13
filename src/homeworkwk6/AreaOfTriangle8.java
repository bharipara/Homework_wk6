package homeworkwk6;

import java.util.Scanner;

/**
 * 8. Write a program to calculate the area of a triangle.
 */

public class AreaOfTriangle8 {

    public static void main(String[] args) {
        //base and height
        int base =0;
        int height =0;
        int area = 0;
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the length of base of triangle :");
        base = scanner.nextInt();

        System.out.println("Enter the length of the height of triangle :");
        height = scanner.nextInt();

        // area =(base * height)/2;
        area = (base * height) / 2;
        System.out.println("The area of Triangle is : " + area);


        scanner.close();
    }
}
