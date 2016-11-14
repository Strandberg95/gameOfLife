package projekt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class InReader {
	
	private File folder = new File("/Users/Strandberg95/Desktop/mofo");
	private File[] listOfFiles = folder.listFiles();
	
	public void readExisting(){

		String str = "";
//		ArrayList<String> fileNames = new ArrayList<String>();
		
		for(int i = 0; i < listOfFiles.length; i++){
			if(listOfFiles[i].isFile()){
//				fileNames.add(listOfFiles[i].getName());
				str += "\n" +  listOfFiles[i].getName();
			}
		}
		
		JOptionPane.showMessageDialog(null, str);
		
	}
	
	public void loadFile(String input){
		
		String path = "";
		
		for(int i = 0; i < listOfFiles.length; i++){
			if(listOfFiles[i].getName().contains(input)){
				path = listOfFiles[i].getAbsoluteFile().toString();
//				System.out.println(path);
			}
		}
		
		
		
		try{ 
			
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			
			String str = "";
			
			String strTemp = br.readLine();
			
		    do
			{
				strTemp = br.readLine();
				str += "\n" +  br.readLine();
				
			}while(strTemp != null);
			
			JOptionPane.showMessageDialog(null, str);
//			System.out.println(str);
			
			br.close();
			
		} catch(IOException e){
			
			System.out.println("File not found");
			
		}
		
		
		
	}
}
