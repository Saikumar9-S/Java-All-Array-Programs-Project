package oops_programming;
import java.util.Scanner;
public class PrintEvenElements
{
	public static int[] createAndInitialise(int size)
	{
		//Create an Array
		int[] arr = new int[size];
		//Initialise
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
