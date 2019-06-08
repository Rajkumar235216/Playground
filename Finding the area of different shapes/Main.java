import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      double a= 0;
      switch(n)
      {
        case 1 : int side = in.nextInt();
                 a = side*side;
                 break;
        case 2 : int l = in.nextInt(); 
                 int b = in.nextInt();
                 a = l*b;
                 break;
      case 3 :  int br = in.nextInt();
                int h = in.nextInt();
                a = (br*h)/2;
                break;
      case 4 : int r = in.nextInt();
               a = 3.14*r*r;
               break;
      }
      
      System.out.println(a);
    }
}