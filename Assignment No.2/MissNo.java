//Find the missing Number in the given array of 1 to N
import java.util.*;
class MissNo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+(n-1)+ "array elements: ");
		for (int i=0; i<=n-2; i++)
		{
			arr[i] = sc.nextInt();
		}
		int sum=(n*(n+1))/2;
		int sumArr = 0;
		for (int i=0; i<=n-2; i++)
		{
		sumArr = sumArr + arr[i];
		}
		int missNo = sum-sumArr;
		System.out.println("missing num is : " + missNo);
	}
}