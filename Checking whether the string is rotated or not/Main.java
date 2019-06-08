import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner scan = new Scanner(System.in);
      String s1 = scan.nextLine();
      
      String s2 = scan.nextLine();
      int s2_len = s2.length();
      s1 = s1.concat(s1);
      int s1_len =  s1.length();
      int idx = 0;
      for (int i = 0; i< s1_len ; i++)
      {
         if (s1.charAt(i) == s2.charAt(0))
         {
             idx = i;
           break;
         }
      }
     
      String s3 = s1.substring(idx, (idx + s2_len));
      
      if (s2.equals(s3) == true)
      {
         System.out.println("Yes");
      }
      else {
         System.out.println("No");
      }
    }
}