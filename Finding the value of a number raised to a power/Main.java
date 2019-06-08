import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int i = in.nextInt();
      int v = 1;
      while(i>=1)
      {
         v = v*n;
        i = i-1;
      }
      System.out.println(v);
    }
}