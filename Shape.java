import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * Base Class for all shapes
 * @author CJGam
 *
 */
public abstract class Shape implements Drawable
{
	/**
	 * Points of the shape
	 */
	protected Point[] location;
	
	/**
	 * Color of the Shape
	 */
	private Color color;
	
	/**
	 * If the shape is filled in
	 */
	private boolean filled;
	
	/**
	 * Constructor for Shape
	 * @param color Color of the Shape
 	 * @param filled If the Shape is filled in
	 */
	public Shape(Color color, boolean filled) 
	{
		this.color = color;
		this.filled = filled;
	}
	
	/**
	 * Gets the points of the Shape
	 * @return Point array of all points in the shape
	 */
	public Point[] getLocation() 
	{
		return location;
	}

	/**
	 * Gets the color of the Shape
	 * @return Color of the Shape
	 */
	public Color getColor() 
	{
		return color;
	}

	/**
	 * Returns if the shape is filled in or not
	 * @return Shape filled or not
	 */
	public boolean isFilled() 
	{
		return filled;
	}
}
