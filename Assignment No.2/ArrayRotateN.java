import java.util.Scanner;
class ArrayRotateN
{
	public static void main(String args[])
	{
	int myarr[]= new int[]{1,2,3,4,5,6,7,8,9,0};//length=10
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number:");
	int n=sc.nextInt();
	
	System.out.println("Old array: ");
	for(int i=0; i<10; i++)
	{
		System.out.print(myarr[i]+ "->"); 
	}
	//array print kiya now we have to 
	//substract array length for ech rotation
	
	
	for(int i=0; i < n; i++)
	{
		int j, end;
		end = myarr[myarr.length-1]; //10-1--> myarr[9]
		
		for(j=myarr.length-1; j>0; j--)
		{
			myarr[j] = myarr[j-1];
		}
		myarr[0] = end;
	}
	
	System.out.print("after rotation");

	
	for(int i=0; i< myarr.length; i++)
	{
		System.out.print("->"+myarr[i]);
	}
	}

}
			
	/*[0:47 pm, 31/12/2021] DAC Pranav Sharma Kh9: Day 2 | Logical Questions : 

Write a Java Program to swap two numbers without using the third variable.
[0:49 pm, 31/12/2021] DAC Pranav Sharma Kh9: Day 2 | Logical Questions : 

Write a Java Program to print number of non-leap years from 1800 - 2050.
[0:55 pm, 31/12/2021] DAC Pranav Sharma Kh9: Day 2 | Logical Questions : 

Write a Java Program to Check Whether One String Is Rotation Of Another?.


If “JavaJ2eeStrutsHibernate” is a string then below are some rotated versions of this string.

“StrutsHibernateJavaJ2ee”, “J2eeStrutsHibernateJava”, “HibernateJavaJ2eeStruts”.

[if you have any doubt, ask me this question*/

