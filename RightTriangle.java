import java.awt.Color;
import java.awt.Point;

public class RightTriangle extends Triangle 
{
	public RightTriangle(Point pointRA, int base, int height, Color color, boolean filled) 
	{
		super(pointRA, color, filled);
		
		location[1] = new Point((int)pointRA.getX() + base, (int)pointRA.getY());
		location[2] = new Point((int)pointRA.getX(), (int)pointRA.getY() + height);
	}

}
