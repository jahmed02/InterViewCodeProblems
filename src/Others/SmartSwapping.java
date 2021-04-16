/*Q) Wtite a JAVA code to swap two numbers without using a temporary variable:*/

package Others;

import java.util.Scanner;

public class SmartSwapping {
    public static void main(String[] args) {

        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

//        int x = 10;
//        int y = 20;

        System.out.println("Before swapping: ");
        System.out.println("First number value: " +x);
        System.out.println("Second number value: " +y);

        System.out.println(" ");

        // logic
        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("After swapping: ");
        System.out.println("First number value: " +x);
        System.out.println("Second number value: " +y);

    }
}
