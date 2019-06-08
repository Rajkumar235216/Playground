import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner scan = new Scanner(System.in);
    String s  = scan.nextLine();
    String s1 = scan.nextLine();
    int l1 = s.length();
    int l2 = s1.length();
    StringBuilder s2 = new StringBuilder(s);
    for(int i = 0; i < l2; i++)
    {
       for(int j = 0; j < l1; j++)
       {
          if (s2.charAt(j) == s1.charAt(i))
          {
            
             for(int k = j; k< l1-1; k++)
             {
                s2.setCharAt(k, s2.charAt(k+1));
             }
            s2.deleteCharAt(l1-1);
            --l1;
          }

       }
    }
    System.out.println(s2);
  }
}