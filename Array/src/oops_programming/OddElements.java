package oops_programming;
import java.util.Scanner;
public class OddElements 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of  the Array:");
		int size = sc.nextInt();
		
		int arr[] = ArrayUtility.createAndInitialise(size);
		ArrayUtility.PrintElements(arr);
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
			}
		}
		
	}

}
