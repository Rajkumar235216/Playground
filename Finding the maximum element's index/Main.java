
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n];
    for (int i = 0; i<n; i++)
    {
       a[i] = in.nextInt();
    }
     int b = 0;
    int x=0;
    for (int i = 0; i<n; i++)
    {
       if (a[i] >b )
       {
          b = a[i];
         x = i;
       }
    }
    System.out.println(x);
  }
}