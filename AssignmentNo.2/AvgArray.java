//1.Calculate the average of given array. 
import java.util.*;
class AvgArray
{
	public static void main(String[] args)
	{
		int arr[]={11,22,33,44,55};
		int temp = 0;
		
		for (int i=0; i< arr.length; i++)
		{
			temp = temp + arr[i];
		}
		int Avg = temp/arr.length;//temp madhe sarvanchi addition asel
		
		System.out.println("the avg is: "+Avg);
	}
}