/*Q) Write a method to check prime numbers in JAVA: */


package Others;

import java.util.Scanner;

public class FindPrimeNumbers {
    // check prime method

    public static boolean checkPrime(int n) {

        if(n <= 1) {
            return false;
        }
        for (int i=2; i<Math.sqrt(n); i++) {    // another logic:  for (int i=2; i<n; i++)
            if (n % i == 0) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        if (checkPrime(input)) {
            System.out.println("Input value "+input+" is a prime number.");
        }
        else {
            System.out.println("Input value "+input+ " is not a prime number.");
        }
    }


}
