//Write a Java Program to find the Intersection of two arrays.
//intersection mhanje common donhi array madhe
class InterSection
{
	public static void main(String args[])
	{
		int a1[] = {87,34,54,12,52};
		int a2[] = {54,74,26,87,67};
		
		System.out.println("Intersection of the two Arrays : ");
		
		for(int i=0; i<a2.length; i++)
		{
			for(int j=0; j<a2.length ; j++)
			{
				if(a1[i]==a2[j]){
					System.out.println(a1[i]);
				}
			}
		}
	}
}
	