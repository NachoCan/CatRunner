import java.awt.Color;
 
public class Lion extends Cat
{
	private color maneColor;
	public Lion (String n, int a, String o, color mC)
	{	
		super (n, a, o);
		maneColor = mC;
		
	}
	public Color getColor ()
	{
		return maneColor
	}
	public setManeColor (Color c)
	{
		maneColor = c
	}
	
	

}
public class roar()
{
	System.out.println(name + " just roared.");
}