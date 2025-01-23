package sorting;

public class bubblesortf {
    public static void main(String[] args) {
        System.out.println("Sorting the array");
        int[] array = {1,2,37,5,43,456,67,45,3,5,4};
        for(int i=0; i<array.length-1;i++){
            for(int j=0; j<array.length-i-1; j++){
                if (array[j]>array[j+1]){
                    int swap = array[j];
                    array[j] = array[j+1];
                    array[j+1] = swap;
                }
            }
        }
        System.out.print("The sorted array is: ");
        for (int dis : array){
            System.out.print(dis+" ");
        }
    }
}
