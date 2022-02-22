//Write a Java Program to print the digits of a Given Number
import java.util.*;
class printDigit
{
	public static void main(String args[])
	{
		int count = 0, num = 2022;
		while(num != 0)
		{
			num /= 10;
			++count;
		}
		//num/=10;
		System.out.println("num of digits: "+count);
		//System.out.println("num of digits: "+num);
		
	}
}