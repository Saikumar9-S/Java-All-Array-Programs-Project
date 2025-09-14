package oops_programming;
import java.util.Scanner;

public class StudentNameArray 
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array:");
	int size = sc.nextInt();
	
	String[] arr = new String[size];
	
	for(int i=0;i<=arr.length-1;i++)
	{
	System.out.println("Enter the names of "+i+" th index ");
	arr[i] = sc.next();
	}
	
	System.out.println("The Names in Array are:");
	
	for(int i=0;i<=arr.length-1;i++)
	{
	System.out.println(arr[i]);
	}
	System.out.println();
}
}
