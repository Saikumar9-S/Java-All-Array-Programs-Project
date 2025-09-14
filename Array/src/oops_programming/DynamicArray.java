package oops_programming;
import java.util.Scanner;
public class DynamicArray 
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Array size :");
	int size = sc.nextInt();
	
	int[] arr = new int[size];
	
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("Enter the index value : "+i);
		arr[i] = sc.nextInt();
	}
	System.out.println("The Array Elements are : ");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+ " ");
	}
	System.out.println();
	}

}
