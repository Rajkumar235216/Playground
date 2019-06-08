import java.util.Scanner;
class Main
{
   static int mostFrequent(int arr[], int n) 
    { 
        int max_count = 1, res = arr[0]; 
        int curr_count = 1; 
       for (int i = 1; i < n; i++) 
        { 
            if (arr[i] == arr[i - 1]) 
                curr_count++; 
            else 
            { 
                if (curr_count > max_count) 
                { 
                    max_count = curr_count; 
                    res = arr[i - 1]; 
                } 
                curr_count = 1; 
            } 
        } 
      
        // If last element is most frequent 
        if (curr_count > max_count) 
        { 
            max_count = curr_count; 
            res = arr[n - 1]; 
        } 
      
        return res; 
    } 
  public static void main(String args[])
  {
    // your code here
     Scanner sc = new Scanner(System.in);
       
       int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
       for(int index = 0; index < arr_size; index++)
       {
           arr[index] = sc.nextInt();
       }
    System.out.println(mostFrequent(arr,arr_size));   }
}