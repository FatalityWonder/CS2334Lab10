import java.awt.Color;
import java.awt.Point;
import javax.swing.JFrame;

public class DrawFrame extends JFrame 
{
	private static DrawPanel drawPanel = new DrawPanel();
	
	public DrawFrame(String title)
	{
		JFrame frame = new JFrame(title);
		
		frame.setSize(300, 300);
		frame.add(drawPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		RightTriangle t = new RightTriangle(new Point(100, 100), 20, 50, Color.BLUE, true);
		
		drawPanel.addShape(t);
		DrawFrame drawFrame = new DrawFrame("test");
	}
}	