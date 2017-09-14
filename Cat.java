public class Cat
{
	//fields//

	private String name;
	private int age;
	private String owner;

	//constructors//
	public Cat (String n, int a, String o)
	{
		name = n;
		age = a; 
		owner = o;
	}
	public Cat ()
	{
		setAge(1);
		setName("a");
		setOwner("o");
	}
	public void eat(String f)
	{
		System.out.println (name + " just ate " + f);
	}


	public String getName ()
	{
		return name;
	}

	public int getAge ()
	{
		return age;
	}

	public String getOwner ()
	{
		return owner;
	}

	public void setName (String n)
	{
		
		name = n;
	}

	public void setAge (int a)
	{
		
		age = a;
	}

	public void setOwner (String o)
	{
		
		owner = o;
	}
}