/*Q) Write code to sort the list of strings using Java collection: */

package CollectionsProblems;

import java.util.Arrays;

public class SortStrings {

    // showList method

    public static void showList (String[] array) {

        for (String str: array) {
            System.out.println(str + "");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String [] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        // Display input un-sorted list

        System.out.println("Input List: " );
        showList(inputList);

        // Call to sort the input list (sorting Strings in a alphabetical order
        Arrays.sort(inputList);

        // Display the sorted list
        System.out.println("\nSorted list: ");
        showList(inputList);

        // Call to sort the input list in case-sensitive order
        System.out.println("\nSorted list (Case-Sensitive)");

        Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);   // sorting classes

        // Display the sorted list
        showList(inputList);


    }
}
