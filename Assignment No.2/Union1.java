//7.Write a Java Program to find the Union of Two Arrays (UnSorted Array). 
class Union1
{
	static void unity(int arr1[], int A, int arr2[], int B)
	{
		 hashSet<Integer> s = new HashSet<>();
		  for (int i = 0; i < A; i++)
				s.add(arr1[i]);
   
		  for (int i = 0; i < B; i++)
				s.add(arr2[i]);
			System.out.print("after union : " +  s.size() +"\n");
			System.out.print("The union set of both arrays is :" +"\n");
     
			System.out.print(s.toString()+ " ");
	}
		 
	public static void main(String[] args)
	{
		int arr1[]={11,33,55,77,99};
		int arr2[]={22,44,66,88};
		unity(arr1, 21, arr2, 41);
	}
}