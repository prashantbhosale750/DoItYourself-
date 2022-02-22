import java.util.*;
import java.util.Scanner;
public class EvenOdd
{
	/*public static void main(String args[])
	{
	int x;
	int y;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter x=");
	x=sc.nextInt();
	System.out.println("Enter y=");
	y=sc.nextInt();
	
	
	if(x%y=0)
		System.out.println("No is even!");
	else
		System.out.println("No is Odd!");
	}*/
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num = ");
		int Num = sc.nextInt();
		if(Num%2==0)
			System.out.println(Num+" is even");
		else
			System.out.println(Num+" is ODD");
	}
}


/*public class EvenOdd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}*/
	