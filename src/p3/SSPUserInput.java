package p3;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

//import f16.UserInput;

public class SSPUserInput extends JPanel implements ActionListener {
	private SSPController controller;
	private JPanel panel = new JPanel(new FlowLayout());// Panel med FlowLayout
	private JButton btnRock = new JButton("Sten");
	private JButton btnScissor = new JButton("Sax");
	private JButton btnPaper = new JButton("Påse");
	private JButton btnNewGame = new JButton("Nytt Spel");
	private JButton btnExit = new JButton("Avsluta");
	final int rock = 1, paper = 2, scissor = 3;

	public SSPUserInput(SSPController controller) {
		this.controller = controller;
		
		// panellens storlek och layout
		setLayout(new BorderLayout());// Huvudpanel med BorderLayout
		setPreferredSize(new Dimension(300, 600));

		// visar knapparna på panellen
		panel.add(btnRock);
		panel.add(btnScissor);
		panel.add(btnPaper);

		// knapparnas position
		add(panel, BorderLayout.NORTH);
		add(btnNewGame, BorderLayout.CENTER);
		add(btnExit, BorderLayout.SOUTH);

		// implementerar listeners
		btnRock.addActionListener(this);
		btnScissor.addActionListener(this);
		btnPaper.addActionListener(this);
		btnNewGame.addActionListener(this);
		btnExit.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		// val av choise
		
		if (e.getSource() == btnRock) {
			int choice = 1;
			controller.game(choice);	
		}
		else if (e.getSource() == btnPaper) {
			int choice = 2;
			controller.game(choice);
		} 
		else if (e.getSource() == btnScissor) {
			int choice = 3;
			controller.game(choice);
		}
		
		// alla värdena i SSPViewer resetas
		else if (e.getSource() == btnNewGame) {
			controller.reset();
		}
		
		// stänger både SSPuserInput och SSPViewer fönstret 
		else if (e.getSource() == btnExit) {
			System.exit(0);
		}
		
	}

}

