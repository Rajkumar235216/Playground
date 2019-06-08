import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      int slen = str.length(); 
      StringBuilder tmp = new StringBuilder("");
      int pldrm = 0;
      for (int i = slen-1; i>= 0; i--)
      {
         tmp.append(str.charAt(i));
        }
       for (int i = 0; i < slen ; i++)
      {
         if (str.charAt(i) == tmp.charAt(i))
         {
            pldrm = 1;
         }
         else 
         {
            pldrm = 0;
         }
        
        }
               if (pldrm == 1)
         {
            System.out.println("Yes");
         }
         else
         {
            System.out.println("No");
         }
    } 
}