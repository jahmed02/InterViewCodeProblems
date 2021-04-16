/*Q) Write a JAVA code to get rid of multiple spaces from a string: */

package Others;

import java.util.Scanner;
import java.util.StringTokenizer;

public class RemoveExtraSpace {

    public static void main(String[] args) {

//        System.out.println("Enter your line with extra spaces: ");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();

        String input = "Try   to   remove  extra   spaces.";
        StringTokenizer substring = new StringTokenizer(input," ");
        StringBuffer sb = new StringBuffer();

        while (substring.hasMoreElements()) {
            sb.append(substring.nextElement()).append(" ");
        }

        System.out.println("\nActual String: " +input);
        System.out.println("After removing spaces: " + sb.toString().trim());
    }
}
