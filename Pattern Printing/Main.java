import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
       Scanner in = new Scanner(System.in);
	    int row = in.nextInt();
        int col = in.nextInt();

		int n = row;
		for(int i = 0 ; i<row; i++)
		{
		    n = row;
		    for(int j = 0 ; j<col; j++)
		    {
		        if(j < i)
		        {
		            System.out.print(n);
		            n--;
		        }
		        else
		        {
		            System.out.print(n);
		        }
		    }
		    System.out.print("\n");
		}
    }
}