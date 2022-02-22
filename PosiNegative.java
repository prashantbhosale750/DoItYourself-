//7.How to check the given number is Positive or Negative in Java?
import java.util.*;
class PosiNegative
{
	public static void main(String args[])
	{
		    Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number : ");
			int number = sc. nextInt();
			
			if(number < 0)
				System.out.println(number + "is a negative number.");
			else if(number > 0)
				System.out.println(number + "is a positive number.");
			else
				System.out.println(number + "is 0");
		
	}
}                                 
		                         