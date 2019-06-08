import java.util.Scanner;
class Main
{
public static void main(String args[])
{
//Try out your code here
  Scanner sc = new Scanner(System.in);
  String s1 = sc.nextLine();
  int s1_len = s1.length();
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
     }
    else if ((s1.charAt(i) >= 'A') && (s1.charAt(i) <= 'Z'))
     {
        int ofset = s1.charAt(i) - 'A';
       stat[ofset]++; 
     }
  }
  char ch;
  for (int i = 0; i <= 25; i++)
  {
     if ((stat[i] == 0))
     {
        int ofset = 'a' + i;
       ch = (char)ofset;
       System.out.print(ch + " ");
     }
  }
}
}
