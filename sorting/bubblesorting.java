package sorting;
//using bubble sort
public class bubblesorting {
    public static void main(String[] args) {
        int[] array = {1,2,345,57,84578,478,34};
        System.out.println("Before sorting");
        for (int dis: array){
            System.out.print(dis+" ");
        }
        int i = 0;
        while (i<array.length-1){
            int j = 0;
            while(j<array.length-1-i){
                if (array[j]>=array[j+1]){
                    int swap = array[j];
                    array[j] =array[j+1];
                    array[j+1]=swap;
                }
                j++;
            }
            i++;
        }
        System.out.println();
        System.out.println("After sorting");
        for (int dis: array){
            System.out.print(dis+" ");
        }
    }
}
