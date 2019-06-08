import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int m1[][] = new int[r][c];
    for (int i = 0; i< r ; i++)
    {
       for(int j = 0 ; j< c ; j++)
       {
          m1[i][j] = in.nextInt();
       }
    }
    int m3[][] = new int[r][c];
    for (int i = 0; i< r ; i++)
    {
       for(int j = 0 ; j< c ; j++)
       {
          m3[j][i] = m1[i][j];
       }
    }
    for (int i = 0; i< r ; i++)
    {
       for(int j = 0 ; j< c ; j++)
       {
          System.out.print(m3[i][j] + " ");
       }
      System.out.print("\n");
    }
  }
}