package Excercise_2;

public class ArrayReverse {
    public static void main(String[] args) {
        int arr1[] = new int[]{3,4,6,2,5,6,0};
        for (int i = arr1.length-1; i >= 0;i--) {  
            System.out.print(arr1[i] + " ");
        }
    }
}