import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
		location = new Point[1];
		
		location[0] = pointUL;
	}
	
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
		Graphics2D g2d = (Graphics2D) graphics;
		g2d.setColor(this.getColor());
		g2d.setStroke(new BasicStroke(5));
        
		if (this.isFilled())
		{
			g2d.fillOval(location[0].x, location[0].y, diameter1, diameter2);
		}
		else
		{
			g2d.drawOval(location[0].x, location[0].y, diameter1, diameter2);
		}

	}

}
