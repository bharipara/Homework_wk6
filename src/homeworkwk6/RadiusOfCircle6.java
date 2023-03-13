package homeworkwk6;

import java.util.Scanner;

public class RadiusOfCircle6 {
    static double radius, area;
    static double pi =3.14;


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

       // double radius, area;
        System.out.println("Enter the radius of the circle");
        radius = obj.nextDouble();
        area= pi *radius *radius;
        System.out.println("Area of the circle is : " + area);



        obj.close();
    }



    }


