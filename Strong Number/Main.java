import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      
        Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp = n;
      int sum = 0;
      for (; temp%10 !=0; temp/=10)
      {  
         int ld = temp%10;
         int fact = 1;
         for (int count = 1; count <=ld; count++)
         {
            fact = fact*count;
         }
        sum = sum + fact;
      }
      if (n == sum)
        System.out.println("Yes");
      else 
        System.out.println("No");
      
	}
	}
