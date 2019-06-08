import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here
      Scanner scan = new Scanner(System.in);
      String s1 = scan.nextLine();
      String s2 = scan.nextLine();
      int s2_len = s2.length();
      String s3 = scan.nextLine();
      System.out.println(s1.replace(s2, s3));
    }
}