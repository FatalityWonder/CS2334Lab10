import java.awt.Color;
import java.awt.Point;
/**
 * class representing a Rectangle
 * @author CJGam
 *
 */
public class Rectangle extends Polygon
{
	/**
	 * Constructor for Rectangle
	 * @param pointUL Upper Left Corner of Rectangle
	 * @param width Width of Rectangle
	 * @param height Height of Rectangle
	 * @param color Color of Rectangle
	 * @param filled If Rectangle is filled
	 */
	public Rectangle(Point pointUL, int width, int height, Color color, boolean filled) 
	{
		super(color, filled);
		location = new Point[4];
		
		location[0] = pointUL;
		location[1] = new Point((int)pointUL.getX() + width, (int)pointUL.getY());
		location[2] = new Point((int)pointUL.getX() + width, (int)pointUL.getY() + height);
		location[3] = new Point((int)pointUL.getX(), (int)pointUL.getY() + height);		
	}

}
