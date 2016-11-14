package chattingProgram;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.LinkedList;

public class ServerListener extends Thread {
	
	private DatagramSocket socket;
	private int[] listOfSockets;
	
	public ServerListener(){
		listOfSockets = new int[1];
		try {
			socket = new DatagramSocket(2345); 
		} catch (SocketException e) {}
	}
	
	public void run(){
		DatagramPacket packet;
		DatagramPacket packet2;
		byte[] readBuffer = new byte[1024];
		byte[] data;
		
		while(!Thread.interrupted()){
			packet = new DatagramPacket(readBuffer,readBuffer.length);
			try {
				
				socket.receive(packet);

//				System.out.println();

			} catch (Exception e) {
				break;
			}
			checkSockets(packet.getPort());
//			data = getCalculated(packet).getBytes();
//			packet2 = new DatagramPacket(readBuffer,readBuffer.length,packet.getAddress(),packet.getPort());
			try {
				for(int i = 0; i < listOfSockets.length - 1; i++){
					packet.setPort(listOfSockets[i]);
					socket.send(packet);
				}

			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
	public void checkSockets(int socket){
		boolean found = false;
		
		for(int i = 0; i < listOfSockets.length; i++){
			if(listOfSockets[i] == socket){
				found = true;
			}
		}
		if(found == false){
			applySocket(socket);
			System.out.println(socket + ""); 
			System.out.println(listOfSockets.length);
		}
	}
	public void applySocket(int socket){
		if(listOfSockets.length == 1){
			listOfSockets[0] = socket;
//			listOfSockets = new int[listOfSockets.length + 1];
			grow();
		}
		else{
//			listOfSockets = new int[listOfSockets.length + 1];

			listOfSockets[listOfSockets.length - 1] = socket;
			grow();
		}

	}
	public void grow(){
		int[] tempArr = new int[listOfSockets.length + 1];
		for(int i = 0; i < listOfSockets.length; i++){
			tempArr[i] = listOfSockets[i];
		}
		listOfSockets = tempArr;
		
	}
}
