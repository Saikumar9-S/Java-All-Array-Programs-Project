package Interface;

interface Sample13
{
	public void test13();
}
interface Sample14 extends Sample13
{
	public void test14();
}
interface Sample15 extends Sample13
{
	public void test15();
}
class Demo9 implements Sample14
{
	@Override
	public void test13()
	{
		System.out.println("Test13 implemented...");
	}
	@Override
	public void test14()
	{
		System.out.println("Test14 implemented...");
	}
}
class Demo10 implements Sample15
{
	@Override
	public void test13()
	{
		System.out.println("Test13 implemented...");
	}
	@Override
	public void test15()
	{
		System.out.println("Test15 implemented...");
	}
}
public class MainClass5 
{
	public static void main(String[] args)
	{
		Demo9 d9 = new Demo9();
		d9.test13();
		d9.test14();
		Demo10 d10 = new Demo10();
		d10.test13();
		d10.test15();
	}

}
