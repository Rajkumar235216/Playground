import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int n2 = in.nextInt();
    int arr1[][] = new int[n1][n2];
    //int arr2[][] = new int[n1][n2];
    for(int i = 0 ; i< n1 ; i++)
    {
       for(int j =0 ; j< n2; j++)
       {
          arr1[i][j] = in.nextInt();
       }
    }
  //  printing rotated 90 degrees anticlockwise  
   for(int i = n2-1 ; i>= 0 ; i--)
    {
       for(int j =0 ; j< n1; j++)
       {
         System.out.print(arr1[j][i] + " ");
       }
     System.out.print("\n");
    }
  }
}