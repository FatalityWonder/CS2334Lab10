import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 * Creates an oval to be drawn
 * @author CJGam
 *
 */
public class Oval extends Shape 
{
	/**
	 * Width of the oval
	 */
	private int diameter1;
	
	/**
	 * height of the oval
	 */
	private int diameter2;
	
	/**
	 * Constructs an Oval object
	 * @param pointUL Upper Left corner of Bounding Box
	 * @param diameter1 Width of the Oval
	 * @param diameter2 Height of the oval
	 * @param color Color of the oval
	 * @param filled If the oval is filled
	 */
	public Oval(Point pointUL, int diameter1, int diameter2, Color color, boolean filled) 
	{
		super(color, filled);
		
		this.diameter1 = diameter1;
		this.diameter2 = diameter2;
		location = new Point[1];
		
		location[0] = pointUL;
	}
	
	/**
	 * 
	 * @return the width of the oval
	 */
	public int getDiameter1() 
	{
		return diameter1;
	}
	
	/**
	 * 
	 * @return the height of the oval
	 */
	public int getDiameter2() 
	{
		return diameter2;
	}
	
	/**
	 * Draws the Oval
	 */
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
