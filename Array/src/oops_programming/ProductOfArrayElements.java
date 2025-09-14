package oops_programming;
import java.util.Scanner;
import java.util.Scanner;
public class ProductOfArrayElements{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int arr[] = {23,34,5,67,90};
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

