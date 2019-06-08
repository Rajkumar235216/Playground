import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code heres
    Scanner scan =new Scanner(System.in);
    String str = scan.nextLine();
    StringBuilder s = new  StringBuilder(str);
    int sl = s.length();
    int k = scan.nextInt();
    for(int i = 0 ; i< sl ; i++)
    {
       if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
       {
          int offset = s.charAt(i) - 'A';
          int ch = (offset - k);
         char c = (char)('A' + ch);
         s.setCharAt(i, c);
       }
       else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
       {
          int offset = s.charAt(i) - 'a';
          int ch = (offset - k);
         if(ch < 0)
         {
           ch = -1 * ch;
           ch = 26-ch;
         }
         char c = (char)('a' + ch);
         s.setCharAt(i, c);
       }
     
    }
    System.out.println(s);
  }
}