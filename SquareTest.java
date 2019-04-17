import java.awt.Color;
import java.awt.Point;
import org.junit.Assert;
import org.junit.Test;
/**
 * Tests the Square class
 * @author CJGam
 *
 */
public class SquareTest 
{
	private static Square SQ1 = new Square(new Point(100, 100), 50, Color.BLACK, true);
	private static Square SQ2 = new Square(new Point(100, 100), 100, Color.BLUE, false);
	private static Point SQ1UL = new Point(100, 100);
	private static Point SQ1LL = new Point(100, 150);
	private static Point SQ1UR = new Point(150, 100);
	private static Point SQ1LR = new Point(150, 150);
	private static Point SQ2UL = new Point(100, 100);
	private static Point SQ2LL = new Point(100, 200);
	private static Point SQ2UR = new Point(200, 100);
	private static Point SQ2LR = new Point(200, 200);
	
	/**
	 * Tests if the constructor set the correct corners of the square
	 */
	@Test
	public void testContstuctorComputedPoints() 
	{
		Point[] pts1 = SQ1.getLocation();
        Assert.assertEquals(4, pts1.length);
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, SQ1UL));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, SQ1UR));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, SQ1LR));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, SQ1LL));
        
        Point[] pts2 = SQ2.getLocation();
        Assert.assertEquals(4, pts2.length);
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, SQ2UL));
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, SQ2UR));
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, SQ2LR));
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, SQ2LL));
	}
	
	/**
	 * tests if the constructor filled in the shape correctly.
	 */
	public void testConstructorFilled()
	{
        Assert.assertTrue(SQ1.isFilled());
        Assert.assertFalse(SQ2.isFilled());
	}
	
	/**
	 * Tests if the constructor set the correct color
	 */
	public void testConstructorColor()
	{
		Color clr1 = SQ1.getColor();
        Color clr2 = SQ2.getColor();
        Assert.assertEquals(Color.BLACK, clr1);
        Assert.assertEquals(Color.BLUE, clr2);
	}

}
