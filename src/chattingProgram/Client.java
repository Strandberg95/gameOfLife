package chattingProgram;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Client {
	
	private JPanel panel;
	private JFrame frame; 
	private JTextField sendField; 
	private JTextPane chattField;
	private JButton sendButton;
	
	private Listener listener;
	
	public Client(){
		listener = new Listener();
		
		panel = new JPanel();
		frame = new JFrame();
		sendField = new JTextField();
		chattField = new JTextPane();
		sendButton = new JButton("SEND");
		
		chattField.setEditable(false);
	
		sendButton.addActionListener(listener);
		
		panel.setLayout(new GridLayout(2,2));
		frame.setLayout(new GridLayout(2,2));
		
		frame.setSize(new Dimension(300,300));
		
		panel.add(sendField);
		panel.add(sendButton);
		frame.add(chattField);
		
		frame.add(panel);
		frame.setVisible(true);
		
		listener.start();
	}
	
	private class Listener extends Thread implements ActionListener{
		
		private InetAddress to;
		private DatagramSocket socket;
		
		public Listener(){
			try {
				to = InetAddress.getByName("127.0.0.1");
				socket = new DatagramSocket(0);
			} catch (UnknownHostException | SocketException e) {}
		}
		
		public void run(){
			while(!Thread.interrupted())
			chattField.setText(recieveFromServer() + "\n" + chattField.getText());
		}
		
		public void sendToServer(String message){
			byte[] data = message.getBytes();
			DatagramPacket packet = new DatagramPacket(data,data.length, to,2345);
			try {
				socket.send(packet);
			} catch (IOException e) {}
		}
		
		public String recieveFromServer(){
			DatagramPacket packet;
			byte[] data = new byte[1024];
			packet = new DatagramPacket(data, data.length);
			try {
				socket.receive(packet);
			} catch (IOException e) {}
			return new String(packet.getData(),0, packet.getLength());
		}

		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == sendButton){
				sendToServer(sendField.getText());
			}
		}
	}
	
	public static void main(String[] args){
		Client client = new Client();
		Client client2 = new Client();
		Client client3 = new Client();
		
		ServerListener sl = new ServerListener();
		sl.start();
		
	}
}
