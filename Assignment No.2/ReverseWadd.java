//Write a Java Program to Reverse the given array without using additional Array
class ReverseWadd
{
	public static void main(String[] args)
	{
		int[] arr = {8,4,9,12,24,8};
		
		System.out.println("Starting ka array : ");
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		
		System.out.println();//next line 
		
		System.out.println("Reverse kiya hua array : ");
		
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i] + " ");
		}
	}
}