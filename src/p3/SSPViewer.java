package p3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;

public class SSPViewer extends JPanel {
	private JLabel lblHeadline = new JLabel("Först till 3 vinner!!");
	private JLabel lblViewer = new JLabel("Human");// viewer=input/human
	private JLabel lblPlayer = new JLabel("Computer");// player= computer
	private JLabel lblCountViewer = new JLabel("0");// points
	private JLabel lblCountPlayer = new JLabel("0");
	private JLabel lblChoiceViewer = new JLabel();// rock paper scissor
	private JLabel lblChoicePlayer = new JLabel();
	private Font plainSS14 = new Font("SansSerif", Font.PLAIN, 14);
	private Font plainSS16 = new Font("SansSerif", Font.PLAIN, 16);
	final int rock = 1, paper = 2, scissor = 3;
	
	private String userChoice = "";
	private String playerChoice = "";
	
	//Viewer panel specifikationer
	public SSPViewer() {
		//panellens storlek och typ av layout
		setPreferredSize(new Dimension(400, 200));
		setLayout(new FlowLayout());

		//lbl storlek och font + lbl position i panellen
		//lblHeadline = spel information
		lblHeadline.setPreferredSize(new Dimension(300, 20));
		lblHeadline.setFont(plainSS16);
		add(lblHeadline, BorderLayout.CENTER);

		// viewer=input/human
		lblViewer.setPreferredSize(new Dimension(150, 20));
		lblViewer.setFont(plainSS14);
		add(lblViewer);

		// player=data
		lblPlayer.setPreferredSize(new Dimension(150, 20));
		lblPlayer.setFont(plainSS14);
		add(lblPlayer);

		//lblCountViewer eller lblCountPlayer = ska visa poäng för viewer/human, resp. player/data
		lblCountViewer.setPreferredSize(new Dimension(150, 20));
		lblCountViewer.setFont(plainSS14);
		add(lblCountViewer);

		lblCountPlayer.setPreferredSize(new Dimension(150, 20));
		lblCountPlayer.setFont(plainSS14);
		add(lblCountPlayer);

		//visar vad spelaren har väljt( sax, påse, sten)
		lblChoiceViewer.setPreferredSize(new Dimension(150, 20));
		lblChoiceViewer.setFont(plainSS14);
		add(lblChoiceViewer);

		lblChoicePlayer.setPreferredSize(new Dimension(150, 20));
		lblChoicePlayer.setFont(plainSS14);
		add(lblChoicePlayer);
	}

	//återställer spel information
	public void resetHeadline() {
		lblHeadline.setText("Först till 3 vinner!!");
	}

	// visar viewer/human som van text
	public void setVWHeadline() { // VWHeadline = Viewer Winner Headline
		lblHeadline.setText("Du Vann!");
	}

	// visar player/data som van text
	public void setPWHeadline(){// PWHeadline = Player Winner Headline
		 lblHeadline.setText("Dator har vunnit!");
	}

	//återställer poäng till 0
	public void resetCount() {
		lblCountViewer.setText("0");
		lblCountPlayer.setText("0");
	}

	// tar bort vad viewer/human eller player/datas val(sten sax påse)
	public void resetChoice() {
		lblChoiceViewer.setText(null);
		lblChoicePlayer.setText(null);
	}
	
	public void setChoice(int userChoice, int playerChoice){ //<---- Changed

		if (userChoice == 1){
			this.userChoice = "Sten";
		}
		
		else if (userChoice == 2){
			this.userChoice = "Påse";
		}
		
		else if (userChoice == 3){
			this.userChoice = "Sax";
		}
		
		if(playerChoice == 1){
			this.playerChoice = "Sten";
		}
	
		else if (playerChoice == 2){
			this.playerChoice = "Påse";
		}

		else if (playerChoice == 3){
			this.playerChoice = "Sax";
		}

	}
	
	// sätter in poäng 
	 public void setResult(int userScore, int playerScore){ //<--- Changed
		 String user = "";
		 String player = "";
		 
		 user = Integer.toString(userScore);
		 player = Integer.toString(playerScore);
		 
		 lblCountViewer.setText(user);
		 lblCountPlayer.setText(player);
			 		 
	 }
}
