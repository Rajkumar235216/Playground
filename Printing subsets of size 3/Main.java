import java.util.Scanner;
class Main{
  public static void threepairs(int as, int arr[])
  {
     for (int i = 0; i< as-1; i++)
     {
        for (int j = (i+1); j< as; j++)
        {
           for (int k = (j+1); k< as; k++)
           {
              System.out.print("(" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")" + " ");
              
           }
          
        }
       System.out.print("\n");
     }
  }
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int as = in.nextInt();
      int arr[] = new int[as];
      for (int i = 0; i< as; i++)
      {
         arr[i] = in.nextInt();
      }
      threepairs(as, arr);
      
    }
}