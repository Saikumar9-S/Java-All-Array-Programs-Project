package Interface;

interface Sample3
{
	public void test3();
}
interface Sample4
{
	public void test4();
}
class Demo4 implements Sample3,Sample4
{
	@Override
	public void test3()
	{
		System.out.println("Test3 implemented according to Demo2.......");
	}
	public void test4() 
	{
	System.out.println("Test4 implemented according to Demo2.......");	
	}
}
public class TwoInterfaces 
{
public static void main(String[] args)
{
	Demo4 d1 = new Demo4();
	d1.test3();
	d1.test4();
}
}
