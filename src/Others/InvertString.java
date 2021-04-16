/*Q) Write a JAVA program to demonstrate string reverse with and without StringBuffer class:*/

package Others;

import java.util.Scanner;

public class InvertString {

    public String invertWithStringBuffer() {
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        return buffer.toString();
    }

    public String invertWithoutStringBuffer () {
        System.out.println("Enter another name: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int length = str.length();
        String original = str;
        String invert = "";

        for (int i=length -1; i >= 0; i--) {
            invert = invert + original.charAt(i);
        }
        return invert;
    }

    public static void main(String[] args) {


        InvertString invertString = new InvertString();

        System.out.println("Inverted string with StringBuffer class: " + invertString.invertWithStringBuffer());

        System.out.println(" ");

        System.out.println("Inverted string without StringBuffer class: " + invertString.invertWithoutStringBuffer());

    }
}
