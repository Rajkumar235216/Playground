import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    int l = s.length();
    int n = 0;
    int count  = 0;
    for( int i = 0; i< l ; i++)
    {
      if((s.charAt(i) >= 48) && (s.charAt(i) <= 57))
         {
            n = n*10 + (s.charAt(i) - '0');
             count++;
         }
         else if(s.charAt(i) == 46)
         {
           count++;
            break;
          }
    }
    float d = 0;
   
    for( int i = count; i< l-1 ; i++)
    {
      if((s.charAt(i) >= 48) && (s.charAt(i) <= 57))
         {
            d = d + (s.charAt(i) - '0')/10.0F;

             }
      else
        break;
    }
    float sum = n+d;
    System.out.print( sum);
 
  }
}