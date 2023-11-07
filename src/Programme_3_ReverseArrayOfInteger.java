import java.util.Scanner;

public class Programme_3_ReverseArrayOfInteger {
    /** this program reverses the original given array and will print both original and reversed array
     * the original array is in series of year numbers from 2005 -2010 and rhe reversed array will output 2010 -2005
     */

    public static void main(String[] args) { //all methods in main method

        int[] originalArray = {2005, 2006, 2007, 2008, 2009, 2010};
        int[] reversedArray = reverse(originalArray);
        System.out.println("Original Array: ");
        printArray(originalArray); //printArray method called with original array
        System.out.println("\nReversed Array: ");
        printArray(reversedArray);  // printArray method called with reversed array
    }

    //function to reverse the array
    public static int[] reverse(int[] arr) { //static method with logic to reverse original array
        int[] reversedArray = new int[arr.length]; //reversedArray is created to store the reversed elements of the original array
        int n = arr.length;
        for (int i = 0; i < n; i++) { //array is added by one
            reversedArray[i] = arr[n - 1 - i];
        }
        return reversedArray;
    }

    //function to print the elements of an array
    public static void printArray(int[] arr) { //printArray function is used both the original and reversed array demonstration
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
