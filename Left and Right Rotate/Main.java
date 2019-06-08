import java.util.Scanner;
class Main 
{
  public static void rotate(int r, int as , int arr[])
    {
        for (int j = 0; j< r ; j++)
        {
       int tev = 0;
       int tod = 0;
       int k = arr[0];
       tod = arr[1];
          if ( as %2 == 0)
            { tev = arr[as-2]; }
          else
            { tev = arr[as-1]; }
      
      for (int i = 0; i< as ; i++)
      {
        if (i % 2 == 0)
        {
          if ( i == (as-1) || i == (as - 2))
           { continue; }
          else 
          
             { int temp = arr[i+2];
                 arr[i+2] = k;
                 k = temp;
             
               
             }
        }
        else 
        {
          if ( i == (as-1) || i == (as - 2))
            continue;
          else  
            arr[i] = arr[i+2];
        }
      }
       
       
           arr[0] = tev;
           if (as % 2 == 0)
           { arr[as-1] = tod; }
          else
           { arr[as-2] = tod; }
        }
  } 
  public static void main(String args[])
    {
    	//Try your code here
    Scanner in = new Scanner(System.in);
    int as = in.nextInt();
    int arr[] = new int[as];
    for (int i = 0; i< as; i++)
    {
       arr[i] = in.nextInt();
    }
    int r = in.nextInt();
    rotate(r, as, arr);
    for (int i = 0; i< as; i++)
    {
       System.out.print(arr[i] + " ");
    }
  	}
}