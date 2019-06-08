import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
       Scanner sc = new Scanner(System.in);
       int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
      int n = 1;
       for(int index = 0; index < arr_size; index++)
       {
           arr[index] = sc.nextInt();
       }
       int left = 0, right = arr_size-1;
      int is_pd = 0;
      while (left<right )
      {
        if (arr[left] == arr[right])
        {
           left++;
          right--;
          is_pd = 1;
        }
        else
        {
          is_pd = 0;
          break;
        }
      }
     if(is_pd == 1)
     {
        System.out.println("Yes");
     }
      else
      {
         System.out.println("No");
      }
    }
}