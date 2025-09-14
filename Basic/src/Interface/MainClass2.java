package Interface;

interface sample5
{
	public void test5();
}
interface sample6 extends sample5
{
	public void test6();
}
class Demo5 implements sample5,sample6
{
	@Override
	public void test5()
	{
		System.out.println("Test5 implemented...");
	}
	@Override
	public void test6()
	{
		System.out.println("Test6 implemented..");
	}
}
public class MainClass2
{
	public static void main(String[] args)
	{
		Demo5 d = new Demo5();
		d.test5();
		d.test6();
		
	}
}
