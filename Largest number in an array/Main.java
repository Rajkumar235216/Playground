import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int gr = 0;
      int arr[] = new int[arr_size];
      for (int i = 0; i < arr_size; i++)
      {
         arr[i] = in.nextInt();
      }
      for (int i = 0; i<arr_size; i++)
      {
         if ( gr < arr[i])
         {
            gr = arr[i];
         }
      }
      System.out.println(gr);
    }
}
