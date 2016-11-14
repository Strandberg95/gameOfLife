package p1;

import java.util.LinkedList;

import javax.swing.Icon;

public class IconManager extends Thread {
	private Buffer<Icon> iconBuffer;
	private LinkedList<IconListener> listeners = new LinkedList<IconListener>();

	public IconManager(Buffer<Icon> iconBuffer) {
		this.iconBuffer = iconBuffer;
	}
	public void addIconListener(IconListener listener){
		listeners.add(listener);
	}

	public void run() {
		Icon temp;
		while (!Thread.interrupted()) {
			try {
				temp = iconBuffer.get();
				for(IconListener i : listeners){
					i.newIcon(temp);
				}
					

			} catch (Exception e) {
				break;
			}
		}
	}
}
