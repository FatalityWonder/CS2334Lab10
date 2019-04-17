import java.awt.Color;
import java.awt.Point;
import org.junit.Assert;
import org.junit.Test;
/**
 * tests the Isosceles Triangle class
 * @author CJGam
 *
 */
public class IsoscelesTriangleTest 
{
	private static IsoscelesTriangle IS1 = new IsoscelesTriangle(new Point(100, 100), 50, 50, Color.CYAN, true);
	private static IsoscelesTriangle IS2 = new IsoscelesTriangle(new Point(100, 100), 100, 75, Color.GRAY, false);
	private static Point IS1L = new Point(100, 100);
	private static Point RT1B = new Point(150, 100);
	private static Point RT1P = new Point(125, 150);
	private static Point IS2L = new Point(100, 100);
	private static Point RT2B = new Point(200, 100);
	private static Point RT2P = new Point(150, 175);
	
	/**
	 * tests if the constructor properly computed points
	 */
	@Test
	public void testContstuctorComputedPoints() 
	{
		Point[] pts1 = IS1.getLocation();
        Assert.assertEquals(3, pts1.length);
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, IS1L));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, RT1B));
        Assert.assertTrue(ShapeUtils.pointInSet(pts1, RT1P));
        
        Point[] pts2 = IS2.getLocation();
        Assert.assertEquals(3, pts2.length);
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, IS2L));
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, RT2B));
        Assert.assertTrue(ShapeUtils.pointInSet(pts2, RT2P));
	}
	
	/**
	 * tests if the constructor filled in the shape properly
	 */
	public void testConstructorFilled()
	{
        Assert.assertTrue(IS1.isFilled());
        Assert.assertFalse(IS2.isFilled());	
	}
	
	/**
	 * tests if the constructor colored the shape properly
	 */
	public void testConstructorColor()
	{
		Color clr1 = IS1.getColor();
        Color clr2 = IS2.getColor();
        Assert.assertEquals(Color.CYAN, clr1);
        Assert.assertEquals(Color.GRAY, clr2);
	}

}
