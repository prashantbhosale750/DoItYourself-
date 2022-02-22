//Write a Java Program to find whether given number is Leap year or NOT? 
import java.util.*;
class LeapYear
{
	public static void main(String args[])
	{
		int year;
		System.out.println("Enter an Year : ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		
		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.println("Leap year");
		else
			System.out.println("this is not leap year");
	}
}