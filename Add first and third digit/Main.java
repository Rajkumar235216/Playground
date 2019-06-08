import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int fd = num / 100;
      int ld = num % 10;
      int sum = fd + ld;
      System.out.println(sum);
	}
}