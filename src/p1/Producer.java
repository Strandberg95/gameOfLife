package p1;

import javax.swing.Icon;

public class Producer extends Thread {
	private Buffer<IconProducer> prodBuffer;
	private Buffer<Icon> iconBuffer;
	
	public Producer(Buffer<IconProducer> prodBuffer, Buffer<Icon> iconBuffer){
		this.prodBuffer = prodBuffer;
		this.iconBuffer = iconBuffer;
	}
	public void run(){
		IconProducer temp;
		while (!Thread.interrupted()){
			try {
				temp = prodBuffer.get();
				if(temp.size()==0){
					return;
				}
				for(int i = 0; i<temp.size()*temp.times(); i++){
					iconBuffer.put(temp.nextIcon());
					Thread.sleep(temp.delay());
				}
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}
