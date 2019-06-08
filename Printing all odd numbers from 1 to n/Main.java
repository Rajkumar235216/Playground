import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for (int odd = 1; odd <= n; odd++)
      {
         if (odd % 2 != 0)
           System.out.println(odd);
          else 
            continue;
      }
	}
}