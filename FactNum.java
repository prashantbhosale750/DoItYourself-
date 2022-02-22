//2.Write a Java Program to find the Factorial of given number. 
import java.util.*;
public class FactNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Num: ");
		int num = sc.nextInt();
		int i=1, fact=1;
		/*while(i<=num)
		{
			fact=fact*i;
			i++;
		}*/
		
		for(i=1; i<=num; i++)
		{
			fact=fact*i;
		}
		System.out.println("Fact. of the NO. is : "+fact);
	}
}