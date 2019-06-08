import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
              Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num = n;
      for (int current_row = 1; current_row <= n; current_row++)
      {
           for (int current_col = num; current_col >= 1; current_col--)
           {
              System.out.print(current_col);
           }
         System.out.print("\n");
        num -= 1;
      }
	}
}