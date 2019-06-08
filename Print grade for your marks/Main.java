import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int l = in.nextInt();
      if (l >=85)
        System.out.println("A");
      else if (l>=75)
        System.out.println("B");
      else if (l>=65)
        System.out.println("C");
      else if (l>=55)
        System.out.println("D");
      else if (l>=45)
        System.out.println("E");
      else
        System.out.println("Fail");
      }
  
    }
