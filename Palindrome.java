import java.util.*;
//Check whether the Given Number is a Palindrome or NOT
class Palindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int p , sum = 0;
		int temp = num;
		while(num > 0)
		{
			p = num % 10;
			sum = (sum*10) + p;
			num = num/10;
		}
		if(temp == sum)
			System.out.println("the no. is Palindrome: " +temp);
		else
			System.out.println("the No. is Not Palindrome: "+temp);
	}
}