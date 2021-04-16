/*Q) Write a JAVA program to find out the first two max values from an array:*/

package Others;

import java.util.Scanner;

public class FindTwoMaxValue {

    // logic method
    public void getTwoMaxValues(int [] nums) {
        int maxOne = 0;
        int maxTwo = 0;

        for (int n: nums) {
            if (maxOne <n) {
                maxTwo = maxOne;
                maxOne =n;
            }
            else if (maxTwo <n) {
                maxTwo = n;
            }
        }
        System.out.println("Max1: " +maxOne);
        System.out.println("Max2: " + maxTwo);
    }

    public static void main(String[] args) {
        System.out.println("How many numbers?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter the numbers now:");
        int[] list = new int[n];
        for (int i=0; i<n; i++) {
            list[i] = sc.nextInt();
        }


        FindTwoMaxValue max = new FindTwoMaxValue();
        max.getTwoMaxValues(list);




        // extra step to print the input array numbers only
//       for (int i=0; i<n; i++) {
//           System.out.println(list[i]);
//       }

    }
}
