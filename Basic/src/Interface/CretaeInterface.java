package Interface;

interface Sample1
{
	public void test1();
}
class Demo1 implements Sample1
{
	@Override
	public void test1()
	{
		System.out.println("Tese1 implemented....");
	}
}
class Demo2 implements Sample1
{
	@Override
	public void test1() 
	{
		System.out.println("Test2 implemented....");
	}
}
public class CretaeInterface
{
public static void main(String[] args)
{
	Demo1 d1 = new Demo1();
	d1.test1();
	Demo2 d2 = new Demo2();
	d2.test1();
}
}
