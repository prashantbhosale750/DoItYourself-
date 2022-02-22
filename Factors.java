//11.Write a Java Program to print all the Factors of the Given number.
class Factors {

  public static void main(String[] args) {
    int number = 60;

    System.out.print("Factors of " + number + " are: ");
    for (int i = 1; i <= number; ++i) {

      // if number is divided by i
      // i is the factor
      if (number % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}