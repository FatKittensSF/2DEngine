import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ResourceManager {
	int currentFileLoad;
ArrayList<RenderComponent> components;
	public ResourceManager ()
	{
		components = new ArrayList<RenderComponent>();
		
		importAssets();
	}
	
	public void addAssets(RenderComponent rend)
	{
		components.add(rend);
	}
	
	public void addAssets(String[] arr)
	{
		components.add(new RenderComponent(arr));
	}
	
	public void addAssets(String objectName,String imageName,String imageDefinition,String fileLocation, String xLocation,String yLocation)
	{
		components.add(new RenderComponent(objectName,imageName,imageDefinition,fileLocation,xLocation,yLocation));
	}
	
	public void importAssets()
	{
		BufferedReader br = null;
		String sCurrentLine;

		try {
			
			String path = System.getProperty("user.dir");
			br = new BufferedReader(new FileReader( path+ "/test.txt"));
			String[] temp = new String[8];
			int x = 0;
			while ((sCurrentLine = br.readLine()) != null) {
				
				if (sCurrentLine.equals(";"))
				{
					System.out.println("objectData: " + temp[0] + " preloaded \n moving on to the next object");
					components.add(new RenderComponent(temp));
					temp = new String[8];
					x = 0;
				}
				else if (sCurrentLine.equals("sceneData:"))
					{
						currentFileLoad = 0;
						System.out.println("currentFieldLoad just set to: " + currentFileLoad);
					}
				else if(sCurrentLine.equals(";"))
				{
					x = -1;
					components.add(new RenderComponent(temp));
					temp = new String[8];
				}
				else if (sCurrentLine.equals("script:"))currentFileLoad = 1;
				else if (currentFileLoad==0)
				{
					System.out.println("added: " + sCurrentLine);
					temp[x] = sCurrentLine.substring(sCurrentLine.indexOf("\"")+1,sCurrentLine.lastIndexOf("\""));
					x++;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public ArrayList<RenderComponent> getComponents()
	{
		return components;
	}
}
