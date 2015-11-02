
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class RenderComponent extends JComponent{
	String objectName,imageName,imageDefinition,fileLocation;
	double xLocation,yLocation;
	BufferedImage image;
	public RenderComponent(String objectName,String imageName,String imageDefinition,String fileLocation, String xLocation,String yLocation)
	{
		this.objectName = objectName;
		this.imageName = imageName;
		this.imageDefinition = imageDefinition;
		this.fileLocation = fileLocation;
		this.xLocation = Double.parseDouble(xLocation);
		this.yLocation = Double.parseDouble(yLocation);
		initData();
		
	}
	
	public RenderComponent(String[] arr)
	{
		objectName = arr[0];
		imageName = arr[1];
		imageDefinition = arr[2];
		fileLocation = arr[3];
		xLocation = Double.parseDouble(arr[4]);
		yLocation = Double.parseDouble(arr[5]);
		
		initData();
		
		
	}
	
	public void initData()
	
	{
	File file = new File(fileLocation + "/" + imageName + "." + imageDefinition);
					
	try {
		image = ImageIO.read(file);
		} catch (IOException e) {
		e.printStackTrace();
		}
	}
	
	
	public BufferedImage getImage()
	{
		return image;
	}
	
	
}

