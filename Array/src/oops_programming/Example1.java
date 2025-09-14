package oops_programming;
import java.util.Scanner;
public class Example1
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Array Size:");
    int size = sc.nextInt();
     
    int arr[] = ArrayUtility.createAndInitialise(size);
    ArrayUtility.PrintElements(arr);
}
}
