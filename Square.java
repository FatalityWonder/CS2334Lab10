import java.awt.Color;
import java.awt.Point;
/**
 * class representing a Square
 * @author CJGam
 *
 */
public class Square extends Rectangle
{

	/**
	 * Constructor for Square
	 * @param pointUL Upper left corner of the Square
	 * @param width side length of the square
	 * @param color Color of the Square
 	 * @param filled If the square is filled in or not
	 */
	public Square(Point pointUL, int width, Color color, boolean filled) 
	{
		super(pointUL, width, width, color, filled);
	}

}
