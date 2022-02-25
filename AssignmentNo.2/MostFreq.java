//Write a program to find the Most Frequent Element in an given array.
//i copied this program coz fail to understand properly!
class MostFreq
{
			static int freq (int arr[], int n, int k)
			{
				for(int i = 0; i<n; i++)
				{
					arr[(arr[i] % k )] +=k;
				}
					
				int max = arr[0], result=0;
				for (int i=1; i<n; i++)
				{
						if (arr[i] > max)
						{
							max=arr[i];
							result=i;
						}
				}
				return result;
				
			}
		
			public static void main(String[] args)
			{
				int arr[] = {6,8,3,6,3,6,9,2,1,6};
				int n = arr.length;
				int k=10;
				System.out.println("most freq ele is : "+ freq(arr,n,k));//throw this value in freq method 
			}
	
}
//arr madhun array send kela
//n madhun arr length ani
//k madhun 