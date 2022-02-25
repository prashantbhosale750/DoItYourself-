import java.util.Scanner;
class ArrayRotateN
{
	public static void main(String args[])
	{
//array declare karu first 
	int myarr[]= new int[]{1,2,3,4,5,6,7,8,9,0};//length=10
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number bro:");
	int n=sc.nextInt();
	
	System.out.println("purana wala array: ");
	for(int i=0; i<10; i++)
	{
		System.out.print(myarr[i]+ "->"); 
	}
	//array print kiya now we have to 
	//substract array length for ech rotation
	
	
	for(int i=0; i < n; i++)
	{
		int j, end;
		end = myarr[myarr.length-1]; //10-1--> myarr[9]
		
		for(j=myarr.length-1; j>0; j--)
		{
			myarr[j] = myarr[j-1];
		}
		myarr[0] = end;
	}
	
	System.out.print("after rotation");

	
	for(int i=0; i< myarr.length; i++)
	{
		System.out.print("->"+myarr[i]);
	}
	}

}
			
	