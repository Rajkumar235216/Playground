import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner scan = new Scanner(System.in);
    String s  = scan.nextLine();
    int l = s.length();
    int m = l/2;
    for (int r = 0 ; r < l ; r++)
    {
       for (int space = 0; space < (l - r - 1); space++)
       {
          System.out.print(" ");
       }
      int i = 0;
      for(int c = 0 ; c <= r; c++)
      {
        if(c <= m)
        {
        System.out.print(s.charAt(m+c));
        }
        else
        {
          
           System.out.print(s.charAt(i));
          ++i;
        }
      }
      System.out.print("\n");
    }
  }
}