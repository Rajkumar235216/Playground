import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum = print(n);
      System.out.println(sum);
    }
  public static int print(int n)
  {
     if (n == 0)
     {
        return 1;
     }
    else 
      return (n * print(n-1));
  }
}