import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class RenderEngine extends JPanel{
	int width, height;
	public RenderEngine(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	public void paintComponent(Graphics g)
	{
		System.out.println(Engine.frame.getHeight());
	
		Graphics2D render = (Graphics2D) g;
		
		Rectangle2D.Double background = new Rectangle2D.Double(0+(Engine.frame.getWidth()/5),Engine.frame.getHeight()/15,Engine.frame.getWidth()/1.5,Engine.frame.getHeight()/1.2);
		render.setClip(background);
		render.setColor(Color.gray);
		render.fill(background);
	}

}
