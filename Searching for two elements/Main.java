import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
            Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int flag1 = 0;
      int flag2 = 0;
      int arr[] = new int[arr_size];
      for (int i = 0; i < arr_size; i++)
      {
         arr[i] = in.nextInt();
      }
       int sr1 = in.nextInt();
       int sr2 = in.nextInt();
      for (int i = 0; i<arr_size; i++)
      {
         if ( sr1 == arr[i])
         {
            System.out.println(i);
           flag1 = 1;
         }
          else if ( sr2 == arr[i])
         {
            System.out.println(i);
            flag2 = 1;
         }
      }
      if (flag1 == 0 || flag2 == 0)
        System.out.println(-1);
    }
}