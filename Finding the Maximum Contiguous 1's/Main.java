import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
       Scanner sc = new Scanner(System.in);
       
       int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
       for(int index = 0; index < arr_size; index++)
       {
           arr[index] = sc.nextInt();
       }
      int ones[] = new int[arr_size];
      int j = 0;
       for(int index = 0; index < arr_size; index++)
       {
           ones[index] = 0;
       }
      for(int i = 0; i<arr_size; i++)
      {
         while(j < arr_size)
         {
           if(arr[j] == 1)
           {
            ones[i] = ones[i] + 1;
             j++;
           }
           else
           {
             j++;
             break;}
         }
        if (i == arr_size)
        {
           break;
        }
      }
      int max = 0;
       for(int index = 0; index < arr_size; index++)
       {
           if(max < ones[index])
           {
              max = ones[index];
           }
       }
      System.out.println(max);
    }
}