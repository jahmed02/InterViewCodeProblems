/*Q) Write a function to reverse a number in JAVA: */

package Others;

import java.util.Scanner;

public class InvertNumbers {

    // invert method

    public long doInvert (long number) {
        long invert = 0;
        while (number != 0) {
            invert = (invert *10) + (number % 10);
            number = number / 10;
        }
        return invert;
    }

    public static void main(String[] args) {

//        System.out.println("Enter your number: ");
//        Scanner sc = new Scanner(System.in);
//
//        long lnum = sc.nextLong();

        long lnum = 654321;
        InvertNumbers input = new InvertNumbers();

        System.out.println("Input value: " + lnum);
        System.out.println("Inverted values: " + input.doInvert(lnum));
    }
}
