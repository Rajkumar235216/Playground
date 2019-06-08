import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int n2 = in.nextInt();
    int arr1[][] = new int[n1][n2];
    int arr2[][] = new int[n1][n2];
    for(int i = 0 ; i< n1 ; i++)
    {
       for(int j =0 ; j< n2; j++)
       {
          arr1[i][j] = in.nextInt();
       }
    }
    for(int i = 0 ; i< n1 ; i++)
    {
       for(int j =0 ; j< n2; j++)
       {
          arr2[i][j] = in.nextInt();
       }
    }
      int flag = 0;
    for(int i = 0 ; i< n1 ; i++)
    {
       for(int j =0 ; j< n2; j++)
       {
         if(arr2[i][j] != arr1[i][j])
         {
           flag = 1;
         }
        }
    }
      if(flag == 1)
     {
         System.out.println("No");
      }
     else
     {
         System.out.println("Yes");
      }
      
  }
}