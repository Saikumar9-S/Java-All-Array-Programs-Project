package basicProgrammings;

import java.util.Scanner;

public class Palindrome 
{
public static int checkRev(int num)
{
	int rev = 0 ;
	while(num>0)
	{
		int ld = num%10;
		rev = rev*10+ld;
		num = num/10;
	}
	return rev;
}
public static int sumOfRev(int num)
{
	int sum = num+checkRev(num);
	return sum;
}
public static boolean isPalindrome(int num)
{
	return num == checkRev(num);
}
public static void checkPalindrome(int num)
{
	  while (true) 
	  {
          int rev = checkRev(num);
          int sum = num + rev;

          if (isPalindrome(sum)) 
          {
              System.out.println("Palindrome is: " + sum);
              break;
          }
          num = sum;
	  }
}
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	checkPalindrome(num);
	sc.close();
}
}
