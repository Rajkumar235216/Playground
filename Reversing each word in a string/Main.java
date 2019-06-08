//import java.lang.*;
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner scan = new Scanner(System.in);
    //int n = scan.nextInt();
    String s = scan.nextLine();
    //int arr[] = new int[n];
    
    StringBuilder s1  = new StringBuilder(s);
    int j =0;
    String[] s2 = s.split(" ", -1);
    for(String each : s2 )
    {
        StringBuilder c = new StringBuilder( each);
        c = c.reverse();
    System.out.print(c + " ");
    }
    
   }
}