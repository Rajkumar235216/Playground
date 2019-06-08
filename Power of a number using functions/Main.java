import java.util.Scanner;
class Main{
  public static int son(int b, int e)
{
   int p = 1;
   for (int i = 1; i<= e; i++)
   {
    p *= b;
   }
   return p;
}
	public static void main (String[] args){
	    // Type your code here

 Scanner in = new Scanner(System.in);
    int b = in.nextInt();
    int e = in.nextInt();
    int p = son(b,e);
    System.out.println(p);
    }
}