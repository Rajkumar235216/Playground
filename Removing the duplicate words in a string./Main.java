import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    StringBuilder s = new StringBuilder(str);
    //StringBuilder s1 = new StringBuilder("");
    int l = str.length();
    String[] s1 = str.split(" " , 0);
   int l1 = s1.length;
   System.out.print(s1[0] + " ");
    for(int i = 1; i<l1 ; i++)
    {
        if(s1[i-1].equals(s1[i]) )
        {
          s1[i-1] = "";
         // System.out.print(s1[i] + " ");
        }
      else
      {
         System.out.print(s1[i] + " ");
      }
      
     
    }

  }
}
