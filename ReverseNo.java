//Write a java program to Reverse a given number
class ReverseNo {
  public static void main(String[] args) {

    int num = 1234, Rev = 0;
    
    System.out.println("Original Number: " + num);
    while(num != 0) {
   
      int digit = num % 10;
      Rev = Rev * 10 + digit;

      num /= 10;
    }

    System.out.println("Reversed Number: " + Rev);
  }
}