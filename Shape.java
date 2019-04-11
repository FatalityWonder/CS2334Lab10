import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class Shape 
{
	protected Point[] location;
	private Color color;
	private boolean filled;
	
	public Shape(Color color, boolean b) 
	{
		// TODO Auto-generated constructor stub
	}
	public abstract void draw(Graphics graphics);

}
