package Abstract;

abstract class E
{
	 abstract public void construct();
}
class F extends E
{
	public void construct()
	{
		System.out.println("The house is nearly constructed.....");
	}
}
class G extends E
{
	public void construct()
	{
		System.out.println("House is constructed...");
	}
}
public class HierarichalInheritance 
{
public static void main(String[] args)
{
	new F().construct();
	new G().construct();
}
}
