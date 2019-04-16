import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public abstract class Polygon extends Shape
{	
	public Polygon(Color color, boolean filled) 
	{
		super(color, filled);
	}

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

        g2d.drawPolygon(xPoints, yPoints, nPoints);
	}

}
