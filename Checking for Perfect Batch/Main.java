import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n];
    int j =0;
    int sum[] = new int[n/3];
    int flag = 0;
    for (int i = 0 ; i<n ; i++)
    { 
       a[i] = in.nextInt();  
    }
    for (int i = 0 ; i<n ; i+=3)
    {
       sum[j] =a[i] + a[i+1] + a[i+2]; 
      j++;
    }
    int b = sum[0];
     for (int i = 1 ; i<j ; i++)
    {
       if (b == sum[i])
       {
          flag = 1;
       }
       else 
       {
          flag = 0;
         break;
       }
    }
    if (flag == 1)
    {
       System.out.println("Perfect Batch");
    }
    else
    {
       System.out.println("Not a Perfect Batch");
    }
  }
}