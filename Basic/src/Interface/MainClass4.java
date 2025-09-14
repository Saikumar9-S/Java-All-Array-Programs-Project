package Interface;
interface Sample10
{
	public void test10();
}
interface Sample11 extends Sample10
{
	public void test11();
}
interface Sample12 extends Sample11
{
	public void test12();
}
class Demo8 implements Sample11,Sample12
{
	@Override
	public void test10()
	{
		System.out.println("Test10 implemented...");
	}
	@Override
	public void test11()
	{
		System.out.println("Test10 implemented...");
	}
	@Override
	public void test12()
	{
		System.out.println("Test10 implemented...");
	}
}
public class MainClass4 
{
public static void main(String[] args)
{
	Demo8 d8 = new Demo8();
	d8.test10();
	d8.test11();
	d8.test12();
}
}
