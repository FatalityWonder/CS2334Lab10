import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class DrawPanel extends JPanel 
{
	/**
	 * List of shapes in the panel
	 */
	private ArrayList<Shape> shapeList;
	
	/**
	 * Creates the panel for shapes
	 */
	public DrawPanel()
	{
		shapeList = new ArrayList<Shape>();
	}
	
	/**
	 * adds a new shape to the panel
	 * @param shape Shape to be added
	 */
	public void addShape(Shape shape)
	{
		shapeList.add(shape);
	}
	
	/**
	 * renders the shapes
	 */
	@Override
	protected void paintComponent(Graphics graphics)
	{
		super.paintComponent(graphics);
		
		for (Shape shape : shapeList)
		{
			shape.draw(graphics);;
		}
	}
}
