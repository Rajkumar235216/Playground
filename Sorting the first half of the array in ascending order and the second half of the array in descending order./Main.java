import java.util.Arrays;
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i<n ; i++)
    {
       arr[i] = scan.nextInt();
    }
    int l = n/2;
    Arrays.sort(arr, 0,l);
    Arrays.sort(arr, l,n);
    int front = l; 
    int end = n-1;
    while(front < end)
    {
       int temp = arr[front];
      arr[front] = arr[end];
      arr[end] = temp;
      front++;
      end--;
    }
    for(int i = 0; i<n ; i++)
    {
       System.out.print(arr[i] + " ");
    }
  }
}