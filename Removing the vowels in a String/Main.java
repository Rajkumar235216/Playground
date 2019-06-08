import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    StringBuilder s = new StringBuilder("");
    int l = str.length();
    for(int i = 0; i< l ; i++)
    {
       if (str.charAt(i) == 'a' || str.charAt(i) =='e' || str.charAt(i) =='i' || str.charAt(i) =='o' || str.charAt(i) =='u' )
       {
         continue;
       }
      else
        s.append(str.charAt(i));
    }
    System.out.println(s);
  }
  
}