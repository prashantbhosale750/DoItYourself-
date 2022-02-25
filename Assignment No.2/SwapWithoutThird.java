//How to Swap two Strings without using third (temporary) variable? 

class SwapWithoutThird 
{  
    public static void main(String args[]) 
	{  
        String s1 = "Prashant";  
        String s2 = "Bhosale";  
        System.out.println("swapping se pehle: " + s1+" " + s2);  
        s1 = s1 + s2;  
        s2 = s1.substring(0, s1.length() - s2.length());  
        s1 = s1.substring(s2.length());  
        System.out.println("After : " + s1 + " " + s2);  
    }  
}  