import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * base class for polygons and draws them
 * 
 * @author CJGam
 *
 */
public abstract class Polygon extends Shape
{	
	/**
	 * Creates a polygon with color and filled
	 * 
	 * @param color Color of the polygon
	 * @param filled Polygon filled in
	 */
	public Polygon(Color color, boolean filled) 
	{
		super(color, filled);
	}
	
	/**
	 * draws the shape
	 */
	@Override
	public void draw(Graphics graphics) 
	{
		Graphics2D g2d = (Graphics2D) graphics;
		g2d.setColor(this.getColor());
		g2d.setStroke(new BasicStroke(5));
        
        int nPoints = location.length;
        int[] xPoints = new int[location.length];
        int[] yPoints = new int[location.length];
        for (int i = 0; i < location.length; ++i)
        {
        	xPoints[i] = location[i].x;
        	yPoints[i] = location[i].y;
        }
        
        if (this.isFilled())
		{
        	g2d.fillPolygon(xPoints, yPoints, nPoints);
		}
		else
		{
			g2d.drawPolygon(xPoints, yPoints, nPoints);
		}
        
	}

}
