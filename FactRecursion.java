class FactRecursion
{
	/*static int fact=1;
	public static void main(String args[])
	{
		int no = 5;
		FactRecursion ob = new FactRecursion();
		ob.calcFact(no);
		System.out.println("Factorial of "+no+" is "+fact);
	}
	void calcFact(int no)
	{
		if(no >= 1)
		{
			fact=fact * no;
			calcFact(no-1);
		}
	}*/
	static int factorial(int n){//we create method"factorial" with para
		if(n==0)
			return 1;
		else
			return(n*factorial(n-1));
	}
	public static void main(String args[])
	{
		int i; fact=1;
		int No = 4;//we find factorial of 4;
		fact = factorial(No);//funtion call itself
		System.out.println("Factorial of "+No+"is;"+fact);
	}
	
}
//javac FactRecursion.java
//FactRecursion.java