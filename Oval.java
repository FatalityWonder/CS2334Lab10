import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Oval extends Shape 
{
	private int diameter1;
	private int diameter2;

	public Oval(Point pointUL, int diameter1, int diameter2, Color color, boolean filled) 
	{
		super(color, filled);
		
		this.diameter1 = diameter1;
		this.diameter2 = diameter2;
	}
	
	THIS IS AN ERROR //TODO draw Oval as well as set points
	
	public int getDiameter1() 
	{
		return diameter1;
	}

	public int getDiameter2() 
	{
		return diameter2;
	}

	@Override
	public void draw(Graphics graphics) 
	{
		// TODO Auto-generated method stub

	}

}
