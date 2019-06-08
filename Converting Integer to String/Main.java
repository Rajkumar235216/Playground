import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
   
    int count = 1; int flag = 0;
    int t  = n;
    if( n< 0 )
    { 
      flag = 1;
      t = -1 * t;
    }
    n = t;
    
    while(t /10  != 0)
    {
       t /= 10 ;
      count++;
    }
    StringBuilder s = new StringBuilder(count+1);

    for(int i = 0; i< count ; i++)
    {
       s.append((char)(n%10 + '0'));
       n = n/10;
    }
    s.reverse();
     
      if (flag == 1)
      {    char p = s.charAt(0);
        for(int i = 1; i< count ; i++)
       {
        char temp = s.charAt(i);
        s.setCharAt(i, p);
       p = temp;
      }
      s.append(p);
      s.setCharAt(0, '-');
      System.out.println(s);
    }
    else{
    System.out.println(s);}
  }
}