//Swap two numbers without using third variable string approach. 
class SwapString
{
	public static void main(String args[])
	{
		String a="Prashant";
		String b="Bhosale";
		
		System.out.println("Before Swapping: a = "+a+" and b= "+b);
		
		a=a+b;
		b = a.substring ( 0, a.length() - b.length());//method substring with 2para
		a = a.substring(b.length());//endindex para
		System.out.println("Strings after Swapping: a = " + a+" and b "+b);
	}
}
		
		