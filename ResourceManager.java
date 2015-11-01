import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

public class ResourceManager {
	int currentFileLoad;
ArrayList<RenderComponent> components;
ArrayList<String> fileLocations;
//ArrayList<>
	public ResourceManager ()
	{
		components = new ArrayList<RenderComponent>();
		fileLocations = new ArrayList<String>();
		importAssets();
	}
	
	public void importAssets()
	{
		BufferedReader br = null;
		String sCurrentLine;

		try {
			
			String path = System.getProperty("user.dir");
			br = new BufferedReader(new FileReader( path+ "/test.txt"));

			while ((sCurrentLine = br.readLine()) != null) {
				if (sCurrentLine.equals("SceneData:"))currentFileLoad = 0;
				else if (sCurrentLine.equals("script:"))currentFileLoad = 1;
				else if (currentFileLoad==0)
				{
				
				}
				System.out.println("added: " + sCurrentLine);
				fileLocations.add(sCurrentLine);
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
}
