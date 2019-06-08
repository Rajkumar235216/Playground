import java.util.Scanner;
class Main{
        public static void son(int n)
{
   int flag = 0;
          System.out.println(2);
   for (int i = 2; i< n; i++)
   { 
      for (int j = 2; j<(i); j++)
      {
          if ((i % j) == 0)
             { 
             flag = 0;
              break;
             }
          else 
          {
            flag = 1;
          }
       }
     if (flag ==1)
     {
        System.out.println(i);
     }
      
   }
}
	public static void main (String[] args){
	    // Type your code here

 Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    son(n);

	}
}