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

public eat(String f);
{
	f = "cat food";
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

public String setName (String n)
{
	name = n;
}

public int setAge (int a)
{
	age = a;
}

public String setOwner (String o)
{
	owner = o;
}
}