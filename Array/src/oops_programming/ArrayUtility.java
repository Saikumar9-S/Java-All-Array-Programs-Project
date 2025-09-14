package oops_programming;
import java.util.Scanner;
public class ArrayUtility 
{
	public static int[] createAndInitialise(int size)
	{
		Scanner sc = new Scanner(System.in);
		//Create an Array
		int[] arr = new int[size];
		//Initialise
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter Array Elements of index values of : "+i);
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	public static void PrintElements(int arr[])
	{
		System.out.print("[");
		for(int i=0;i<=arr.length-1;i++)
		{
			if(i==arr.length-1)
			{
				System.out.print(arr[i]);
			}
			else
			{
				System.out.print(arr[i]+ ",");
			}
		}
		System.out.print("]");
	}
}
