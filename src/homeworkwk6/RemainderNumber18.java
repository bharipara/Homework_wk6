package homeworkwk6;

/**
 * 18. Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */

public class RemainderNumber18 {

    public static void main(String[] args) {

        //Scanner remain = new Scanner(System.in);
        int n1 = 125;
        int n2 = 24;
        int remainder;
        int ans = n1+n2;
        int ans1 = n1*n2;
        int ans2 = n1-n2;
        int ans3 = n1/n2;
        int ans4 = n1 %24;
        int a;

        System.out.println("Input first number : " + n1);
        System.out.println("Input second number : " + n2);

        System.out.println("125"+ "+ "+ "24" + "=" + ans);
        System.out.println("125"+ 'x' + "24" + "=" +ans1);
        System.out.println("125"+ "-" +"24" + "=" + ans2);
        System.out.println("125"+ "/" +"24" + "=" + ans3);
        System.out.println("125"+ "%" + "24" + "=" + ans4);


    }
}
