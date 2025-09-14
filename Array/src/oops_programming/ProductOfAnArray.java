package oops_programming;
import java.util.Scanner;
public class ProductOfAnArray 
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the  size of an Array:");

	int size = sc.nextInt();
	
	int arr[] = new int[size];
	int prod = 1;
	for(int i=0;i<=arr.length-1;i++)
	{	
		System.out.println("Enter the elements of "+i+" index");
		arr[i] = sc.nextInt();
		prod = prod*arr[i];
	
	}
	System.out.println(prod);
}
}
