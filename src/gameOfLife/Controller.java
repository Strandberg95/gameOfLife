package gameOfLife;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.*;

public class Controller {
	
	private JFrame frame = new JFrame("GOL");
	
	final int WIDTH = 330;
	final int HEIGHT = 330;
	
	private boolean[][] grid1 = new boolean[WIDTH][HEIGHT];
	private boolean[][] grid2 = new boolean[WIDTH][HEIGHT];
	
	private MyPanel panel = new MyPanel(grid1,grid2);
	
	private Random rdm = new Random();
	
	private int maxValue1 = 10;
	private int minValue1 = 1;
	
	private int maxValue2 = 50;
	private int minValue2 = 40;
	
	private Graphics g;
	
	public Controller(){
		
	}
	
	
	public void newGame(){
		
		frame.setSize(1000, 1000);
		frame.setLayout(new BorderLayout());
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.addMouseListener(new MouseListen());
		
		frame.setVisible(true);
		
		g = frame.getGraphics();
		
		minValue1 = rdm.nextInt(WIDTH / 4);
		System.out.println(minValue1);
		
		while(maxValue1 <= minValue1){
			maxValue1 = rdm.nextInt(WIDTH);
			System.out.println(maxValue1);
		}
		
		minValue2 = rdm.nextInt(WIDTH / 4);
		System.out.println(minValue2);
		
		while(maxValue2 <= minValue2){
			maxValue2 = rdm.nextInt(WIDTH);
			System.out.println(maxValue2);
		}
		

		
		setStart(grid1,minValue1,maxValue1);
		setStart(grid2,minValue2,maxValue2);

		
		while(true){
			

			start();
			frame.repaint();
		}
	}
	
	public void setStart(boolean[][] grid, int min, int max){
		
		for(int i = 0; i < 300; i++ ){
			grid[rdm.nextInt(max - min) + min][rdm.nextInt(max - min) + min] = true;
			frame.repaint();
		}
	}
	
	public void start(){
		
			gridRound(grid1,grid2);
			
			pause();
			
			gridRound(grid2,grid1);
			
	}
	
	public void gridRound(boolean[][] grid,boolean[][] otherGrid){
		
		for(int row = 0; row < grid.length; row++){
			for(int column = 0; column < grid.length; column++){
				
				int rdmValue = rdm.nextInt(20);
				
				if(grid[row][column] == true){
					if(otherGrid[row][column] == true){
						if(rdmValue > 10)
							otherGrid[row][column] = false;
						if(rdmValue <= 10)
							grid[row][column] = false;
					}
				}
				
				int neighbors = 0;
				//Checks the values around the main value
				for(int i = row - 1; i <= row + 1; i++){
					for(int j = column - 1; j <= column +1; j++){
						
						//Checks if the value actually exists within the grid
						if(i >= 0 && i < grid.length){
							if(j >= 0 && j < grid.length){
								//This statements makes sure that the main values is not used 
								//as a neighbor 
								
//								if(j != row && i != column){ //This does not work for some reason. hmm
								
									//This statements check if the neighboring values are true
									if(grid[i][j] == true)
										neighbors++;
									
//								}
							}
						}
					}
					
				}
				// I need to find a better solution for this.
				if(grid[row][column] == true)
					neighbors--;
				
				grid[row][column] = evaluate(neighbors,grid[row][column]);
				
//				System.out.println(row + ":" + column + " Has " + neighbors + " neighbors");
			}
		}
	}
	
	public void pause(){
		Random rdm = new Random();
		double timer = 0;
		while(timer < 10000000f)
			timer += 1;
	}
	
	public boolean evaluate(int neighbors, boolean value){
		boolean inValue; 
		inValue = value;
		
		if(inValue == true){
			if(neighbors > 3 || neighbors < 2){
				return false;
			}
		}
		if(inValue == false){
			if(neighbors == 3)
			return true;
		}
		return inValue;
		
	}
	
	
	public static void main(String[] args){
		
		Controller ctrl = new Controller();
		ctrl.newGame();
	}
	
	private class MouseListen implements MouseListener{
		
		@Override
		public void mouseClicked(MouseEvent e) {

			
		}

		@Override
		public void mouseEntered(MouseEvent e) {

	
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {

			
		}
		
		public void mouseReleased(MouseEvent e) {
//			int row = Math.min((e.getY() / (panel.getHeight() / HEIGHT)),HEIGHT - 1);
//			int column = Math.min(e.getX() / (panel.getWidth() / WIDTH),WIDTH - 1);
//////			
////			int row = panel.getHeight() / e.getY();
////			int column = panel.getWidth() / e.getX();
//			
//			grid[column][row - 1] = !grid[column][row - 1];
//			frame.repaint();
			
		}
		
	}



}


