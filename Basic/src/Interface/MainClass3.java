package Interface;
interface Sample7
{
	public void test7();

	void test16();
}
interface Sample8 extends Sample7
{
	public void test8();
}
interface Sample9 extends Sample8
{
	public void test9();
}
class Demo8 implements Sample9
{
	@Override
	public void test7()
	{
		System.out.println("Test7 implemented..");
	}
	@Override
	public void test8()
	{
		System.out.println("Test8 implemented..");
	}
	@Override
	public void test9()
	{
		System.out.println("Test9 implemented..");
	}
	@Override
	public void test16() {
		// TODO Auto-generated method stub
		
	}
	
}
public class MainClass3 
{
	public static void main(String[] args0)
	{
		Demo8 d7 = new Demo8();
		d7.test7();
		d7.test8();
		d7.test9();
	}
}
