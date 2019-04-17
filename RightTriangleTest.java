import java.awt.Color;
import java.awt.Point;
import org.junit.Assert;
import org.junit.Test;

public class RightTriangleTest 
{
	private static RightTriangle RT1 = new RightTriangle(new Point(100, 100), 50, 50, Color.RED, true);
	private static RightTriangle RT2 = new RightTriangle(new Point(100, 100), 50, -50, Color.YELLOW, false);
	private static Point RT1RA = new Point(100, 100);
	private static Point RT1D = new Point(100, 100);
	private static Point RT1B = new Point(100, 100);
	private static Point RT2RA = new Point(100, 100);
	private static Point RT2U = new Point(100, 100);
	private static Point RT2B = new Point(100, 100);	
	
	@Test
	public void testContstuctorComputedPoints() 
	{
		Point[] pts1 = RT1.getLocation();
        Assert.assertEquals(3, pts1.length);
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, RT1RA));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, RT1B));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, RT1D));
        
        Point[] pts2 = RT2.getLocation();
        Assert.assertEquals(3, pts2.length);
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, RT2RA));
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, RT2B));
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, RT2U));
	}

	public void testConstructorFilled()
	{
        Assert.assertTrue(RT1.isFilled());
        Assert.assertFalse(RT2.isFilled());	
	}
	
	public void testConstructorColor()
	{
		Color clr1 = RT1.getColor();
        Color clr2 = RT2.getColor();
        Assert.assertEquals(Color.RED, clr1);
        Assert.assertEquals(Color.YELLOW, clr2);
	}
}
