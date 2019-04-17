import java.awt.Color;
import java.awt.Point;
import org.junit.Assert;
import org.junit.Test;

public class RectangleTest 
{
	private static Rectangle R1 = new Rectangle(new Point(100, 100), 50, 100, Color.BLACK, true);
	private static Rectangle R2 = new Rectangle(new Point(100, 100), 75, 150, Color.BLUE, false);
	private static Point R1UL = new Point(100, 100);
	private static Point R1LL = new Point(100, 200);
	private static Point R1UR = new Point(150, 100);
	private static Point R1LR = new Point(150, 200);
	private static Point R2UL = new Point(100, 100);
	private static Point R2LL = new Point(100, 250);
	private static Point R2UR = new Point(175, 100);
	private static Point R2LR = new Point(175, 250);
	
	@Test
	public void testContstuctorComputedPoints() 
	{
		Point[] pts1 = R1.getLocation();
        Assert.assertEquals(4, pts1.length);
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, R1UL));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, R1UR));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, R1LR));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, R1LL));
        
        Point[] pts2 = R2.getLocation();
        Assert.assertEquals(4, pts2.length);
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, R2UL));
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, R2UR));
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, R2LR));
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, R2LL));
	}
	
	public void testConstructorFilled()
	{
        Assert.assertTrue(R1.isFilled());
        Assert.assertFalse(R2.isFilled());	
	}
	
	public void testConstructorColor()
	{
		Color clr1 = R1.getColor();
        Color clr2 = R2.getColor();
        Assert.assertEquals(Color.BLACK, clr1);
        Assert.assertEquals(Color.BLUE, clr2);
	}

}
