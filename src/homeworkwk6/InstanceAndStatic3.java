package homeworkwk6;
/**
 * Write a Java programme using the following steps.
 *         3.1 Declare one instance and one static variable.
 *         3.2 Declare one instance method.
 *         3.3 Declare one static method.
 *         3.4 Call both instance and static variables into both instance and static methods inside the
 *         print statement.
 *         3.5 Declare the Main method.
 *         3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class InstanceAndStatic3 {
    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
     InstanceAndStatic3 obj = new InstanceAndStatic3();
     obj.myMethod();
     myMethod1();
    }
    public void myMethod(){

        System.out.println(a);
        System.out.println(b);
    }
    public static void myMethod1(){
        InstanceAndStatic3 obj  = new InstanceAndStatic3();
        System.out.println(obj.a);
        System.out.println(b);
    }



}
