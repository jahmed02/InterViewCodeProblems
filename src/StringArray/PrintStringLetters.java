package StringArray;

import java.util.Scanner;

public class PrintStringLetters {

    public static void main(String[] args) {
        System.out.println("Enter your string: ");


        Scanner sc = new Scanner(System.in);
        String string  = sc.nextLine();

        System.out.println(string);

        int count =0;

        for(int i =0; i<string.length();i++) {
            if (string.charAt(i) != 0) {
                count ++;
            }
        }

        System.out.println("Total letters: " + count);

        //System.out.println(count);

        // Another easy way to print it

        System.out.println("Another way to print: " + string.length());


    }
}
