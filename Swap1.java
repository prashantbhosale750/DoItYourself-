//4.Swap two numbers "using" third variable approach 1. 
//i use third variable in this example 
class Swap1
{
	public static void main(String args[])
	{
		int a=12, b=22;
		
		System.out.println("First No.= "+a);
		System.out.println("First No.= "+b);
		int c = a;
		a=b;
		b=c;
		System.out.println("First No.= "+a);
		System.out.println("First No.= "+b);
	}
}
		
	