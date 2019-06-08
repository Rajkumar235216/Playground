import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      	Scanner in = new Scanner(System.in);
  		// Type your code here
    int n = in.nextInt();
    int num = 0;
      for (int current_row = 1; current_row <= n; current_row++)
      {
          for (int current_col = 1; current_col <= n; current_col++)
          {
               
                 System.out.print(current_row);
            
          }
           System.out.print("\n");
      }
	}
}