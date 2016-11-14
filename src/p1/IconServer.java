package p1;

import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.Icon;

import p1.IconListener;
import p1.IconManager;

public class IconServer implements IconListener {
	private ArrayList<Socket> sockets = new ArrayList<Socket>();

	public IconServer(IconManager im, int port) {
		im.addIconListener(this);
		new ConnectionHandler(port).start();

	}

	private class ConnectionHandler extends Thread {
		private int port;

		public ConnectionHandler(int port) {
			this.port = port;
		}

		public void run() {
			Socket socket = null;
			try (ServerSocket serverSocket = new ServerSocket(port)) {
				while (true) {
					try {
						socket = serverSocket.accept();
						sockets.add(socket);

					} catch (Exception e) {
						if (socket != null) {
							socket.close();
						}
					}
				}
			} catch (Exception e) {
			}
		}
	}

	public void newIcon(Icon icon) {
		for (Socket socket : sockets) {
			try {
				ObjectOutputStream objout = new ObjectOutputStream(socket.getOutputStream());
				objout.writeObject(icon);
				objout.flush();
			} catch (Exception e) {
			}
		}

	}

}
