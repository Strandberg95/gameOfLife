package projekt;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Controller {
	
	private OutWriter ow = new OutWriter();
	private InReader ir = new InReader();
	
	public void actionMenu(){
		
		boolean ended = false;
		
		while(!ended){
			
//			clear();
			
			int des = 0; 
			
			des = choices();
			
//			des = in.nextInt();
			
		
			if(des == 1){
				
				String str;
				
				ir.readExisting();
				
				str = JOptionPane.showInputDialog("Choose File");
				
				ir.loadFile(str);
				
//				System.out.println("| Write #Exit when done |");
				
				
			}
			
			if(des == 2){
//				clear();
				
				boolean isEnded = false;
				
				String str = "";
				
				int index = 0;
				
//				System.out.println("What would you like to add?");

				
				while(!isEnded){
					
					String tempStr = "";
					tempStr = JOptionPane.showInputDialog("What would you like to add?");
					

					if("#Exit".equals(tempStr)){
						isEnded = true;
						tempStr = "";
					}
//					str += tempStr;
//					
//					if(index > 0)
					str += tempStr + "\n"; 
//					else
//						str += tempStr;
//					
//					for(int i = 0; i < tempStr.length(); i++){
//						str += "-";
//					}
//					str += "\n";
					
					index++;
					
				}
				System.out.println(str);
				ow.write(str);
				
			}
			if(des == 3){
				System.exit(0);
			}
		}
	}
	
	public int choices(){
		
		int des = Integer.parseInt(JOptionPane.showInputDialog("1: Check Calendar \n"
				+ "2: Write to Calendar \n"
				+ "3: Exit"));
		
		
		return des;
		
	}
	
//	public void clear(){
//		
//		System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n "
//				+ "\n \n \n \n \n \n \n \n \n");
//	}
	
	public static void main(String[] args){
		Controller ctrl = new Controller();
		
		ctrl.actionMenu();
			
		
	}

}
