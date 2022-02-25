//Write a java program to check Given String is Palindrome or NOT. 
class PalindromeOrNot {
  public static void main(String[] args) {

    String str = "TeneT", RevStr = "";//string chya jagi we can number also can check
    
    int strLength = str.length();

    for (int i = (strLength - 1); i >=0; --i) {
      RevStr = RevStr + str.charAt(i);
    }

    if (str.toLowerCase().equals(RevStr.toLowerCase())) {
      System.out.println(str + " is a Palindrome String.");
    }
    else {
      System.out.println(str + " is not a Palindrome String.");
    }
  }
}