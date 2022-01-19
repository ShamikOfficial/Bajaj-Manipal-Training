//Q3) WAP to check year is LEAP year or not
package Excercise_1;
public class Q3
{
	public static void main(String[] args) {
	    int year=2024;
	    if((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0))
	    {
	       System.out.println("It is a Leap Year"); 
	    }
	    else{
	        System.out.println("It is not a Leap Year"); 
	    }
	        
	}
}