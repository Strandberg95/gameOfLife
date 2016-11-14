package p3;

import javax.swing.JFrame;

public class SSPController {
	private SSPViewer viewer;
	private SSPPlayer player;
	
	private int userScore = 0;
	private int playerScore = 0;
	
	public SSPController(SSPPlayer player, SSPViewer viewer){
		this.player = player;
		this.viewer = viewer;
		
	}
	public void game(int choice){
		
		/*I've removed the Loop because when you start a new round another iteration begins 
		 * and therefore the loop you had would never end.
		 *I've also made it so the controller-class keeps track of the score, because the controller-class 
		 *is supposed to tell the viewer-class when someones score exceeds 3.  
		 *
		 *I've also might slight changes in the viewer-class so that it now allows you to send information
		 *The problem was that the information was sent incorrectly by trying to convert an integer to string after 
		 *already initializing the integer itself. I suggest you compare the change i've done to your code to get a better
		 *understanding :P 
		 *
		 *Also. In the UserInput-class you extend the JFrame-object to the class instead of JPanel.
		 *
		 *Hope this helps! :D 
		 */
		
		
		int userChoice = choice;
		int playerChoice = player.newChoice();
	    


			if (choice == 2 && playerChoice == 3){
				//computer wins round
				playerScore++;
			}
			if (choice == 1 && playerChoice == 2){
				//computer wins round
				playerScore++;
			}
			if (choice == 3 && playerChoice == 1){
				//computer wins round
				playerScore++;
			}
			
			
			if (choice == 3 && playerChoice == 2){
				//user wins round
				userScore++;
			}
			if (choice == 2 && playerChoice == 1){
				//user wins round
				userScore++;
			}
			if(choice == 1 && playerChoice == 3){ 
				//User wins round
				userScore++;
			}
			viewer.setChoice(choice, playerChoice);
			viewer.setResult(userScore, playerScore);
	
			if (userScore >= 3){
				viewer.setVWHeadline();	
			}
			
			if(playerScore >= 3){
				viewer.setPWHeadline();	
			}
	}
	
	
	// when pressing btnNewGame set lblHeadline to information, count to 0  and choice to nothing
	public void reset(){
		viewer.resetHeadline();	
		viewer.resetCount();
		viewer.resetChoice();
		
		
	}
	// when pressing btnExit it should exit the game 
	public void exit(){
		System.exit(0);
		
		
		
	}
	public static void main( String[] args ) {
	    SSPPlayer player = new SSPPlayer();
	    SSPViewer viewer = new SSPViewer();
	    SSPController controller = new SSPController(player, viewer);
	    SSPUserInput userInput = new SSPUserInput(controller);
	    JFrame frame1 = new JFrame( "SSPViewer" );
	    frame1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	    frame1.add( viewer );
	    frame1.pack();
	    frame1.setVisible( true );
	    JFrame frame2 = new JFrame( "SSPUserInput" );
	    frame2.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	    frame2.add( userInput );
	    frame2.pack();
	    frame2.setVisible( true );
	}

}
