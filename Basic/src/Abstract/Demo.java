package Abstract;

abstract class A
{
	public abstract void display();
}
class B extends A
{
	public void display()
	{
		System.out.println("Test completed");
	}
}
public class Demo

{
	public static void main(String[] args)
	{
	new B().display();
	}
}
