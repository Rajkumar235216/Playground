import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String[] s  = new String[n];
     for (int i = 0 ; i< n ; i++)
     {
       s[i]= scan.next();
       
     }
    int k = 0;
   for (int i = 0 ; i< n ; i++)
    {
      for(int j = 0 ; j< (n-1) ; j++)
      {
        String a  = s[j];
        String b = s[j+1];

         
        char c = a.charAt(k);
        char d = b.charAt(k);
       if(c > d )
       {
         s[j+1] = a;
         s[j] = b;
        }
    }
   }
    for(int i = 0; i<n ; i++)
    {
    System.out.println(s[i].toLowerCase());
    }
    
   }
}