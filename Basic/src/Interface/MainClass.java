package Interface;
abstract class Orange
{
	abstract public void Color();
}
interface Apple
{
	public void Type();
}
class Fruit extends Orange implements Apple
{
	@Override
	public void Color()
	{
		System.out.println("Oragne...");
	}
	public void Type()
	{
		System.out.println("Sweet...");
	}
}
public class MainClass 
{
	public static void main(String[] args)
	{
	new Fruit().Color();
	new Fruit().Type();
}
}
