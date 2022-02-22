//Write a Java Program to find sum of the digits of a given number
import java.util.*;
class SumOfDigits
{
	public static void main(String args[])
	{
		int num,digi, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		num=sc.nextInt();
		
		while(num>0)
		{
			digi = num % 10;
		    sum  = sum+digi;
			num =num/10;
		}
		System.out.println("Sum of Digits: "+sum);
	}
}
// 200%10=0;
//0+20=20;
//200/10=20