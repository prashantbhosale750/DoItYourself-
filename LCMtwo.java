//Write a java program to LCM of TWO given number. 
class LCMtwo
{
	 public static void main(String[] args) {

    int No1 = 25, No2 = 120, LCM;
    LCM = (No1 > No2) ? No1 : No2;

    while(true) {
		
      if( LCM % No1 == 0 && LCM % No2 == 0 ) {
        System.out.printf("The LCM of %d and %d is %d.", No1, No2, LCM);
        break;
      }
      ++LCM;
    }
  }
}