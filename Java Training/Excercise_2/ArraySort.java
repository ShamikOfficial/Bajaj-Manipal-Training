package Excercise_2;

public class ArraySort {
    public static void main(String[] args) {
        int arr1[] = new int[]{8,7,4,9,3,5,2,6,1};
        for (int i=0; i<arr1.length; i++)   
        {  
            for (int j=i+1; j<arr1.length; j++)   
            {  
                int temp=0;  
                if (arr1[i] > arr1[j])   
                {  
                    temp = arr1[i];  
                    arr1[i] = arr1[j];  
                    arr1[j] = temp;  
                }
            }  
        }  
        for (int i:arr1) {  
            System.out.print(i + " ");
        }
    }
}