// Q5) WAP to implement switch statement. (any use case) 

public class Main
{
	public static void main(String[] args) {
	    String day="Monday";
	    switch(day)
	    {
	        case "Monday":
	            System.out.println("It is a Weekday");
	            break;
	        case "Tuesday":
	            System.out.println("It is a Weekday");
	            break;
	       case "Wednesday":
	            System.out.println("It is a Weekday");
	            break;
	       case "Thursday":
	            System.out.println("It is a Weekday");
	            break;
	       case "Friday":
	            System.out.println("It is a Weekday");
	            break;
	       case "Saturday":
	            System.out.println("It is a Weekend");
	            break;
	       case "Sunday":
	            System.out.println("It is a Weekend");
	            break;
	       default:
	            System.out.println("Please enter a valid day");
	    }
	}
}