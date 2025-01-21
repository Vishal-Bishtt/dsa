package LinearAndBinary;

import java.util.Scanner;

//search a element in a array {1,2,3,4,5,6,7,8,9,10}
public class linear {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter the number you want to search: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i;
        for (i =0;i<10;i++){
            if(array[i]==num){
                System.out.println("Yes the number exist in your array");
            }
        }
    }
}
