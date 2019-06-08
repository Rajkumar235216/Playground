import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
       Scanner str = new Scanner(System.in);
	   String s1 = str.nextLine();
	   String s2 = str.nextLine();
       int n = str.nextInt();
	  String[] a = s2.split(" ", n);
	  for(String b : a)
	    {System.out.println(b);  }
    }
}