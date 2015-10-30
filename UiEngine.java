import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class UiEngine extends JPanel
{
	ArrayList<UiComponent> components;
	int width,height;
	public UiEngine(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	public void paintComponent(Graphics g)
	{
		Graphics2D render = (Graphics2D) g;
		Rectangle2D.Double background = new Rectangle2D.Double(0,0,width,height);
		render.setColor(Color.black);
		render.fill(background);
	}
	
	public void AddUiComponent(UiComponent comp)
	{
		components.add(comp);
	}
	
	public UiComponent Componentcontains(int x, int y)
	{
		for(UiComponent comp: components)
		{
			if(comp.contains(x, y));
		}
	}

}
