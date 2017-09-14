import java.awt.Color;
 
public class Lion extends Cat
{
	private Color maneColor;
	
	public Lion (String n, int a, String o, Color mC)
	{	
		super (n, a, o);
		maneColor = mC;
		
	}
	public Lion()
	{
		setAge(1);
		setName("a");
		setOwner("a");
		setManeColor(Color.YELLOW);
	}
	public Color getColor ()
	{
		return maneColor;
	}
	public void setManeColor (Color c)
	{
		maneColor = c;
	}
	
	public void roar()
	{
		
		System.out.println (getName() + " just roared.");
	}
}
