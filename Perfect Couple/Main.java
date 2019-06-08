import java.util.Scanner;
class Main{
  public static void pairs(int sv, int as, int arr[])
  {
    int sum = 0;
     for (int i = 0; i< as; i++)
     {
        for (int j = (i+1); j< as; j++)
        {
          sum = arr[i] + arr[j];
          if (sum == sv)
          { 
            System.out.println(arr[i] + ", " + arr[j]);
          }
        }
      
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
      int sv = in.nextInt();
      pairs(sv, as, arr);
    }
}