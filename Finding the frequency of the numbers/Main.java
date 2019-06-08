import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int arr[] = new int[n];
    for(int idx = 0; idx <= n - 1; idx++){
      arr[idx] = sc.nextInt();
    }
      int a[] = new int[k];
      for(int idx = 0; idx <k ; idx++){
           a[idx] = idx+1; 
    }
      for(int i = 0; i < k; i++){
        int count = 0;
           for(int j = 0; j <= n - 1; j++){
               if (a[i] == arr[j])
               {
                  count++;
               }
                 
             }
         System.out.println(a[i] + " " + count);
    }
      
   
    }
}