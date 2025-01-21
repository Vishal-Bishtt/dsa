package LinearAndBinary;
//searching an element in an given array from binary search method
import java.util.Scanner;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to search: ");
        int num = input.nextInt();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean result = search(num, 0, array.length - 1, array);
        if (result) {
            System.out.println("Yes, the element exists in your array.");
        } else {
            System.out.println("No, the element does not exist in your array.");
        }
    }

    public static boolean search(int num, int low, int high, int[] array) {
        if (low > high) {
            return false; // Base case: element not found
        }

        int mid = low + (high - low) / 2; // Calculate mid-point

        if (array[mid] == num) {
            return true; // Element found
        } else if (array[mid] < num) {
            return search(num, mid + 1, high, array); // Search in the right half
        } else {
            return search(num, low, mid - 1, array); // Search in the left half
        }
    }
}

