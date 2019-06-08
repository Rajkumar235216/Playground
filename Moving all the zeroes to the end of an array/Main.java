import java.util.Scanner;
class Main{
    public static void separate(int as , int arr[])
    {
       int j = 0;
      int zc = 0;
      int posar[] = new int[as];
      for (int i = 0; i< as ; i++)
      {
        if (arr[i] > 0)
        {
           posar[j] = arr[i];
          j++;
        }
        else 
        {
           zc++;
        }
      }
      int k = 0;
      for (int i = 0; i< j ; i++)
      {
         arr[k] = posar[i];
        ++k;
      }
      for (int i = 0; i< (zc) ; i++)
      {
         arr[k] = 0;
         ++k;
      }
    }
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int as = in.nextInt();
      int arr[] = new int[as];
      for (int i = 0; i< as ; i++)
      {
         arr[i] = in.nextInt();
      }
      separate(as, arr);
      for (int i = 0; i< as ; i++)
      {
         System.out.print(arr[i] + " ");
      }
    }
}