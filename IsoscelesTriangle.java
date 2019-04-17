import java.awt.Color;
import java.awt.Point;

/**
 * class to create isosceles triangles
 * @author CJGam
 *
 */
public class IsoscelesTriangle extends Triangle 
{
	/**
	 * Creates an Isosceles triangle
	 * @param pointLB Bottom Left point in the triangle
	 * @param base Width of the triangle
	 * @param height Height of the triangle
	 * @param color Color of the triangle
	 * @param filled If the triangle is filled in
	 */
	public IsoscelesTriangle(Point pointLB, int base, int height, Color color, boolean filled) 
	{
		super(pointLB, color, filled);
		
		location[1] = new Point((int)pointLB.getX() + base, (int)pointLB.getY());
		location[2] = new Point((int)pointLB.getX() + (base / 2), (int)pointLB.getY() + height);
	}

}
