import java.awt.Color;
import java.awt.Point;
import javax.swing.JFrame;

public class DrawFrame extends JFrame 
{
	/**
	 * Panel all shapes are added to
	 */
	private static DrawPanel drawPanel = new DrawPanel();
	
	/**
	 * creates the window that is displayed
	 * @param title of the frame
	 */
	public DrawFrame(String title)
	{
		JFrame frame = new JFrame(title);
		
		frame.setSize(605, 645);
		frame.add(drawPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		Rectangle sky = new Rectangle(new Point(0, 0), 600, 500, new Color(135, 206, 235), true);
		Circle sun = new Circle(new Point(100, 100), 80, new Color(253, 184, 19), true);
		Rectangle grass = new Rectangle(new Point(0, 500), 600, 100, Color.GREEN, true);
		Rectangle trunk = new Rectangle(new Point(100, 410), 20, 100, new Color(101, 67, 33), true);
		IsoscelesTriangle mountain = new IsoscelesTriangle(new Point(400, 505), 150, -325, Color.DARK_GRAY, true);
		Oval leaves = new Oval(new Point(70, 280), 80, 150, new Color(58, 95, 11), true);
		Sinusoid grassleaf = new Sinusoid(Color.GREEN, new Point(0, 500), 1, 20, 10);
		Oval cloud1 = new Oval(new Point(330, 200), 150, 35, Color.WHITE, true);
		Oval cloud2 = new Oval(new Point(140, 100), 150, 35, Color.WHITE, true);
		RightTriangle riv1 = new RightTriangle(new Point(500, 505), 35, 100, Color.BLUE, true);
		RightTriangle riv2 = new RightTriangle(new Point(500, 605), -35, -100, Color.BLUE, true);
		Diamond sunflare1 = new Diamond(new Point(90, 140), 30, Color.YELLOW, true);
		Diamond sunflare2 = new Diamond(new Point(150, 140), 30, Color.YELLOW, true);
		Diamond sunflare3 = new Diamond(new Point(120, 110), 30, Color.YELLOW, true);
		Diamond sunflare4 = new Diamond(new Point(120, 170), 30, Color.YELLOW, true);
		
		drawPanel.addShape(sky);
		drawPanel.addShape(sunflare1);
		drawPanel.addShape(sunflare2);
		drawPanel.addShape(sunflare3);
		drawPanel.addShape(sunflare4);
		drawPanel.addShape(sun);
		drawPanel.addShape(grass);
		drawPanel.addShape(grassleaf);
		drawPanel.addShape(trunk);
		drawPanel.addShape(mountain);
		drawPanel.addShape(leaves);
		drawPanel.addShape(cloud1);
		drawPanel.addShape(cloud2);
		drawPanel.addShape(riv1);
		drawPanel.addShape(riv2);
		
		DrawFrame drawFrame = new DrawFrame("Sunny Scenery");
	}
}	