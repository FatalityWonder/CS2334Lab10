import java.awt.Color;
import java.awt.Point;
/**
 * Class representing a RightTriangle
 * @author CJGam
 *
 */
public class RightTriangle extends Triangle 
{
	/**
	 * Constructor for RightTriangle
	 * @param pointRA Corner of the Right Angle
	 * @param base Length of the Base
	 * @param height Height of the Triangle
	 * @param color Color of the Triangle
	 * @param filled If the Triangle is filled in
	 */
	public RightTriangle(Point pointRA, int base, int height, Color color, boolean filled) 
	{
		super(pointRA, color, filled);
		
		location[1] = new Point((int)pointRA.getX() + base, (int)pointRA.getY());
		location[2] = new Point((int)pointRA.getX(), (int)pointRA.getY() + height);
	}

}
