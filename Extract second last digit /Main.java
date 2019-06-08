import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int l = in.nextInt();
     
      
      int sld = (l/10)%10;
      System.out.println(sld);
	}
}