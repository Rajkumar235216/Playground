import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp = n;
      int original_no = n;
      int sum = 0;
      int count = 0;
      int remainder;
      int ld;
      for (; temp != 0; temp/=10)
      {
         count +=1;  
      }
      for (int i = 1; i <= count; i++)
      {
         ld = n%10;
         remainder = ld*ld*ld;
         n /=10;
         sum += remainder;
      }
      if (sum == original_no)
        System.out.println("Armstrong Number");
      else 
        System.out.println("Not a Armstrong Number");
	}
}