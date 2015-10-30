import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class UiComponent extends JComponent implements Component{
	Rectangle2D rect;
	public void UiComonent(int x, int y, int width, int height)
	{
		
		rect = new Rectangle2D.Double(x, y, width, height);
		this.getBounds((Rectangle) rect);
	}
	
	public void onClick() 
	{
	 if(EngineState.isEditMode() == true)
	 {
		 JOptionPane.showMessageDialog(null, "no Action assigned to this component");
	 }
	 
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D cRender = (Graphics2D) g;
		cRender.setColor(Color.cyan);
		cRender.fill(rect);
	}
	


}
