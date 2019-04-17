import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

@RunWith(Suite.class)

@Suite.SuiteClasses
({
	SquareTest.class,
	RectangleTest.class,
	OvalTestOfficial.class,
	SinusoidTest.class,
	IsoscelesTriangleTest.class,
	RightTriangleTest.class,
	PolyLineTest.class,
	DiamondTestOfficial.class
})

public class TestRunner 
{
	public static void main(String[] args) 
	{
		Result result = JUnitCore.runClasses(TestRunner.class);
		for (Failure failure : result.getFailures()) 
		{
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());
	}
}
