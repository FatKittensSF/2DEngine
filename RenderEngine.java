
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JPanel;

public class RenderEngine extends JPanel{
	int width, height;
	ArrayList<BufferedImage> images;
	ArrayList<RenderComponent> comps;
	private ResourceManager manager;
	
	public RenderEngine(int width, int height)
	{
		this.width = width;
		this.height = height;
		init();
	}
	
	private void init()
	{		
		manager = new ResourceManager();
		comps = manager.getComponents();
		updateImages();
		
	}
	public void paintComponent(Graphics g)
	{
		System.out.println(Engine.frame.getHeight());
	
		Graphics2D render = (Graphics2D) g;
		
		Rectangle2D.Double background = new Rectangle2D.Double(0+(Engine.frame.getWidth()/5),Engine.frame.getHeight()/15,Engine.frame.getWidth()/1.5,Engine.frame.getHeight()/1.2);
		render.setClip(background);
		render.setColor(Color.gray);
		render.fill(background);
		
		renderComponents(render);
		
		
		
	}
	
	public void renderComponents(Graphics2D render)
	{
		for(BufferedImage x : images)
		{
			render.drawImage(x, 200, 200, 200+222, 300+561, 0, 0, 222, 561, null);
			System.out.println("drawing umage to screen");
		}
	}
	
	public void updateImages()
	{
		images = new ArrayList<BufferedImage>();
		for(RenderComponent x : comps)
		{
			images.add(x.getImage());
		}
	}

}










