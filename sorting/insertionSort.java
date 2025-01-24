package sorting;
//insertion sort
public class insertionSort {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 8, 2, 3, 6, 43, 354};
        System.out.print("Array before sorting: ");
        for (int dis : array) {
            System.out.print(dis + " ");
        }
        for (int i = 1; i<array.length;i++){ //iterating the array
            int key = array[i];
            int j = i-1;
            while(j>=0 && array[j]>key ) {   //this loop will find the index at which index we should put the key so that it can be sorted
                array[j+1]= array[j];
                j--;
            }array[j+1] = key;              //assigning the value of key to that index
        }

        System.out.print("Array after sorting: ");
        for (int diss : array) {
            System.out.print(diss + " ");
        }
    }
}
