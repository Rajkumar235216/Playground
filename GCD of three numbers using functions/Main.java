import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
	 Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int n2 = in.nextInt();
    int n3 = in.nextInt();
    int a = gcd(n1, n2);
    int b = gcd(a,n3);
    System.out.println(b);
	}
        
public static int gcd(int n1, int n2)
{
  int min = 0;
  int a = 0;
if (n1 < n2)
 {
    min = n1;
 }
else 
  {
     min = n2;
 }
  if ((n1%min == 0) && (n2%min == 0))
    a = min;
  else 
    min--;
  
  return min;
}
}