package Interface;

interface sample
{
	public void display();
	public void show();
}
abstract class demo implements sample
{
	@Override
	public void display()
	{
		System.out.println("Sample are loaded...");
	}
}
class demo1 extends demo
{
	@Override
	public void show()
	{
		System.out.println("Show details...");
	}
	
}
public class MainClass1 
{
	public static void main(String[] args)
	{
	demo1 d = new demo1();
	d.display();
	d.show();
	}
}
