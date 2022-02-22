//Write a Java Program to swap two numbers without using the third variable.
import java.util.Scanner;
class Swap2No
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter X : ");
		int x = sc.nextInt();
		System.out.print("Enter Y : ");
		int y = sc.nextInt();
		
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("after swapping:x= "+x+" y= "+y);
	}
}
		//x=23+34=57
		//y=57-34=23
		//x=57-23=34
		
		
