package homeworkwk6;

/**
 * 4. Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class TwoInstanceAndStatic4 {
    int a =15;
    int b = 20;
    static int x =5;
    static int y =10;

    public static void main(String[] args) {
        TwoInstanceAndStatic4 obj = new TwoInstanceAndStatic4();
        obj.myClass();
        myClass2();


    }
    void myClass(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);

    }
    public static void myClass2(){
        TwoInstanceAndStatic4 obj = new TwoInstanceAndStatic4();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(x);
        System.out.println(y);
    }
}
