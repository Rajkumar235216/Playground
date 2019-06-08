import java.util.Scanner;
class Main
{
public static void main(String args[])
{
//Try out your code here
  Scanner sc = new Scanner(System.in);
  String s1 = sc.nextLine();
  int s1_len = s1.length();
  StringBuilder s = new StringBuilder("");
  int stat[] = new int[26];
  for (int i = 0; i< 26; i++)
  {
     stat[i] = 0;
  }
  for (int i = 0; i< s1_len ; i++)
  {
     if ((s1.charAt(i) >= 'a') && (s1.charAt(i) <= 'z'))
     {
        int ofset = s1.charAt(i) - 'a';
       stat[ofset]++; 
       s.append((char)('a' + ofset));
     }
    else if ((s1.charAt(i) >= 'A') && (s1.charAt(i) <= 'Z'))
     {
        int ofset = s1.charAt(i) - 'A';
       stat[ofset]++; 
      s.append((char)('a' + ofset));
     }
  }
  int count = 0;
for (int i = 0; i < s1_len; i++)
  {
     int ofset = s.charAt(i) - 'a';
     if ((stat[ofset]) != 0)
     {
       
       System.out.print(s.charAt(i));
       System.out.print(stat[ofset] + " "); 
       stat[ofset] = 0;

     }
  }
 
}
}