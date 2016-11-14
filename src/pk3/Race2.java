package pk3;
import java.awt.Color;
import java.util.Random;
/**
 * 
 * @author Fredrik Larsson
 *  Startar ett race mellan tv� bilar.
 */

public class Race2 {
		private PaintWindow window;
	    private Car car1;
	    private Car car2;
	   
	    public Race2(PaintWindow window, Car car1, Car car2){
	        this.window = window;	      
	        this.car1 = car1;
	        this.car2 = car2;

	       
	    }

	    public void action(){
	    	
    		this.resetCars();
    		this.draw();
    		
	    	while (car1.getX() > 20 && car2.getX() > 20){
	    		
	    		this.doRace();
	    		this.drawCars();
	    		
	    	}

	    }

	    private void doRace(){
	    	Random random = new Random();
	    	 	
	        car1.moveTo(car1.getX() - random.nextInt(5), car1.getY());
	        car2.moveTo(car2.getX() - random.nextInt(5), car2.getY());
	            
	        PaintWindow.pause(10);
	    }
	    
	    private void resetCars(){
	    	car1.moveTo(500, 195); 
	        car2.moveTo(500, 265);
	           
	    }

	    private void drawCars(){
	        window.showImage(car1.getImage(), car1.getX(), car1.getY());
	        window.showImage(car2.getImage(), car2.getX(), car2.getY());
	    
	    }

	    public void draw(){
	        // Bakgrund
	        window.fillRect(0, 0, 600, 400, Color.GREEN );
	        // v�g1
	        window.fillRect(0, 180, 600, 60, Color.GRAY);
	        // v�g2
	        window.fillRect(0, 250, 600, 60, Color.GRAY);
	        // M�llinje
	        window.fillRect(20, 170, 3, 160, Color.BLUE);  
	    }
	}