import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      
Scanner in = new Scanner(System.in);
int n = in.nextInt();
for (int row = 1 ; row <=n ; row++)
   {
      for (int col = 1; col<= n; col++)
      {
         if  (row %2 == 0)
         {  if( col != 1){
           System.out.print(row);}
            else
            {   System.out.print(row+1);
             }
         }
           else{
             if( col != n)
             {
                System.out.print(row);}
          else
          {   System.out.print(row+1);
           }
        } 
     
   }
    System.out.print("\n");
	}
}
}