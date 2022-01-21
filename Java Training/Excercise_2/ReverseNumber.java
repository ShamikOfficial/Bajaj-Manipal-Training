package Excercise_2;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 13579, answer=0;  
        System.out.println("Original number: "+num); 
        while(num!=0)   
        {  
            int remainder = num % 10;  
            answer = answer * 10 + remainder;  
            num = num/10;  
        }  
        
        System.out.println("\nReversed number: "+answer);  
    }
}