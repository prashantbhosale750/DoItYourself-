//Write a Java Program to Print 1 To 10 Without Using Loop
//we can recursion for this purpose!
import java.util.*;
class print1to10
{
	public static void main(String args[])
	{
		int num = 1;
		Print(num);
	}
		
		
	public static void Print(int num)
	{ 
		if(num <= 20)
		{
			System.out.println(num + " ");
		    Print(num+1);
		}
	}
	
	/*public static void main(String args[])
	{
		Print(100);
	}
	
	public static void Print(int num)
	{ 
		if(num > 0)
		{
			System.out.println(num + " ");
		    Print(num-1);
		}
	}*/
}

