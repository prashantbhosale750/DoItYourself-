//Write a Java Program to find GCD of two given numbers
class GDCtwo
{
	public static void main(String[] args)   	
	{
		int num1=25, num2=50;
		
		while(num1 != num2)
		{
			if(num1>num2)
			{
				num1 -= num2;
			}
			else
			{
				num2 -= num1;
			}
		}
	System.out.println("GCD is: "+num1);
	}
}

