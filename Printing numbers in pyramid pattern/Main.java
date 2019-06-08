import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
              Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num = 1;
      for (int current_row = 1; current_row <= n; current_row++)
      {
         for (int space=1; space <= (n-(current_row)); space++)
         {
            System.out.print(" ");
         }
      
           for (int current_col = 1; current_col <= current_row; current_col++)
           {
              System.out.print(num+" ");
             num += 1;
           }
         System.out.print("\n");
      }
    }    
}