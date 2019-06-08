import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int fd = n/10;
      int sd = n%10;
      int sum = fd + sd;
      System.out.println(sum);
	}
}