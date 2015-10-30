package 2DEngine;
import javax.swing.JFrame;

public class Engine {
	static int width = 500,height = 500;
	static JFrame frame;
	public static void main(String[] args)
	{
		frame = new JFrame("test");
	
		frame.setSize(width,height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new UiEngine(500,500));
		frame.add(new RenderEngine(500,500));
		frame.setVisible(true);
	}

}
