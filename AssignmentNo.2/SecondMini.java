//3.Find the second minimum number in the given array. 
import java.util.Arrays;
class SecondMini
{
	public static void main(String args[])
	{
		int arr[]={88,29,57,91,22};
		int size=arr.length;
		Arrays.sort(arr);
		System.out.println("Sorted array : " + Arrays.toString(arr));
		int Result = arr[size-4];//bcoz 5-4=1 we got 2nd position dude!!
		System.out.println("Second Mini : "+ Result);
	}
}
		
	