package sorting;

public class selectionSort {
    public static void main(String[] args) {
        System.out.println("Sorting the array");
        int[] array = {1, 2, 37, 5, 43, 456, 67, 45, 3, 5, 4};
        System.out.print("Array before sorting: ");
        for (int dis : array) {
            System.out.print(dis + " ");
        }
        int minIndex = 0;
        for (int i = 0; i < array.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {           // this will find the minimum value from the array
                    minIndex = j;                           // assigning the index the value of j
                }
               // System.out.print(minIndex+" ");
            }
            int swap = array[minIndex];                     // swapping the elements
            array[minIndex] = array[i];
            array[i] = swap;
        }

        System.out.print("Array after sorting: ");
        for (int diss : array) {
            System.out.print(diss + " ");
        }
    }
}
