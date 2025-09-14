package Interface;
interface Sample16
{
	public void test16();
}
interface Sample17
{
	public void test17();
}
interface Sample18 extends Sample16,Sample17
{
	public void test18();
}
class Demo12 implements Sample18
{

	@Override
	public void test16()
	
	{
		System.out.println("Test16 implemented...");
		
	}

	@Override
	public void test17() 
	{
		System.out.println("Test17 implemented...");
		
	}

	@Override
	public void test18()
	{
		System.out.println("Test18 implemented...");
		
	}	
}
public class MainClass6
{
	public static void main(String[] args)
	{
		Demo12 d12 = new Demo12();
		d12.test16();
		d12.test17();
		d12.test18();
	}
}
