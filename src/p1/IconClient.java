package p1;

import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.LinkedList;

import javax.swing.Icon;

import p1.IconListener;

public class IconClient {
	private LinkedList<IconListener> listeners = new LinkedList<IconListener>();

	public IconClient(String host, int port){
		new IconHandler(host, port);
	}
	public void addIconListener(IconListener listener){
		listeners.add(listener);
	}
	private class IconHandler extends Thread{
		private Socket socket;
		private ObjectInputStream inputStream;
		private Icon icon;

		public IconHandler(String host, int port){
			try {
				socket = new Socket(host, port);
				start();

			} catch (Exception e) {
			}
		}
		public void run(){
			while(true){
				try {
					inputStream = new ObjectInputStream(socket.getInputStream());
					icon = (Icon) inputStream.readObject();
					for (IconListener listener : listeners){
						listener.newIcon(icon);
					}
				} catch (Exception e) {
				}
			}
		}
	}
}
