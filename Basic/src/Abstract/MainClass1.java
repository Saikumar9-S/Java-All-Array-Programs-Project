package Abstract;

abstract class Demo1
{
	public abstract void contact();
	public abstract void ringtone();
}
abstract class Start extends Demo1
{
	@Override
	public void contact()
	{
		System.out.println("Father Contact.....");
	}
}
class Ends extends Start
{
	public void ringtone()
	{
		System.out.println("Nannaku prematho.....");
	}
}

public class MainClass1 
{
	public static void main(String[] args)
	{
	Ends E = new Ends();
	E.contact();
	E.ringtone();
}
}
