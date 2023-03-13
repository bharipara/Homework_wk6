package homeworkwk6;

/**
 * 15. Write a Java program to swap two variables.
 */

public class SwapVariables15 {

    public static void main(String[] args) {

        String a = "Bharti";
        String b = "Haripara";
        String swap;
        swap = a;
        a=b;
        b = swap;

        System.out.println("a : " + a);
        System.out.println("b : " + b);



    }
}
