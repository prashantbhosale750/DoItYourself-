//2.Find the second largest number in the given array. 
//array ko sort karke 2nd largest nikalenge pan this is applicable only
//in limited size chya array madhe only bro

import java.util.Arrays;
//Arrays is class from util pakage
class SecondLargest
{
	public static void main(String args[])
	{
		 
		int arr[]={33,44,87,23,66};
		int size=arr.length;
		
		Arrays.sort(arr);//we sort array here ascending order ne
		
		System.out.println("sorted Array: "+Arrays.toString(arr));
		
		int Result = arr[size-2];//5-2=3
		System.out.println("2nd Largest element is: "+Result);
	}
}



