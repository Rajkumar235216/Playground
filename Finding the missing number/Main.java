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
       while(n <arr_size)
       {
         int num = n; 
         for(int index1 = 0; index1 <= arr_size-1; index1++) 
       {
           if (n == arr[index1])
           {
              n++;
           }
       }
         if (num == n)
         {
            System.out.println(num);
           n++;
         }
       }
    }
}