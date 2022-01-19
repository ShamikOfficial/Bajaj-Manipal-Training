//Q2) WAP to find out prime number
package Excercise_1;
public class Q2
{
	public static void main(String[] args) {
	    int num=13,flag=0;
	    for(int i=2;i<num;i++)
	    {
	        if (num%i==0)
	        {
	            flag=1;
	            break;
	        }
	    }
	    if (flag==0)
	    {
	        System.out.println("It is a Prime number");
	    }
	    else
	    {
	        System.out.println("It is not a Prime number");
	    }
	}
}