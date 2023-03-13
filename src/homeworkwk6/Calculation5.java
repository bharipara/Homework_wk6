package homeworkwk6;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */

public class Calculation5 {
    public static void main(String[] args) {
        Calculation5 cal = new Calculation5();
            addition(10,15);
            subtraction(20,30);
            cal.multiplication(10,15);
            cal.division(50,5);

    }
    public static void addition(int a,int b){
        int ans =  a+b;
        System.out.println("Sum of two number is : " + ans);

    }
    public static void subtraction(int a, int b){
        int ans = a-b;
        System.out.println("Subtraction of two number is : " + ans);
    }
    void multiplication(int a, int b){
        Calculation5 cal = new Calculation5();
        int ans = a*b;
        System.out.println("multiplication of two number is : " + ans);
    }
    void division(int a,int b){
        Calculation5 cal = new Calculation5();
        int ans = a/b;
        System.out.println("Division of two number is : " + ans);
    }

}
