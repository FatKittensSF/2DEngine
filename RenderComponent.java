
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class RenderComponent extends JComponent{
	Rectangle2D.Double rect;
	public RenderComponent(double x, double y, double width, double height)
	{
		
		rect = new Rectangle2D.Double(x,y,width,height);
		
	}
	
	public RenderComponent(Image image)
	{
		
		
	}
	
	public Rectangle2D.Double getObject()
	{
		return rect;
	}

	

}
