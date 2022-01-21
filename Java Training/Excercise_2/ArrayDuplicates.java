package Excercise_2;

public class ArrayDuplicates {
    public static void main(String[] args) {
        int arr1[] = new int[]{1,4,2,5,6,6,4,3};
        for(int i=0; i<arr1.length; i++) {  
            for(int j=i+1; j<arr1.length; j++) {  
                if(arr1[i] == arr1[j])  
                    System.out.println(arr1[j]);  
            }
        }
    }
}