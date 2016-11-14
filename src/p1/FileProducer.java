package p1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * Klassen skapar en arraylist som fylls med hjälp av sökvägar som finns lagrade
 * i en fil som klassen läser in.
 * 
 * @author Krallan
 *
 */
public class FileProducer implements IconProducer {
	private ArrayList<Icon> list = new ArrayList<Icon>();
	private int delay = 0;
	private int times = 0;
	private int currentIcon = -1;

	/**
	 * instansierar FileProducer.
	 * 
	 * @param filename
	 *            sökväg till fil att läsa
	 */
	public FileProducer(String filename) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF-8"))) {
			times = Integer.parseInt(br.readLine());
			delay = Integer.parseInt(br.readLine());
			String str = br.readLine();
			while (str != null) {
				addIcon(str);
				str = br.readLine();
			}
		} catch (IOException e) {
		}
	}

	private void addIcon(String filename) {
		Icon icon = new ImageIcon(filename);
		if (icon != null) {
			list.add(icon);
		}
	}

	/**
	 * retunerar fördröjning.
	 */
	public int delay() {
		return delay;
	}

	/**
	 * retunerar antalet gånger som ett objekt skall skickas.
	 */
	public int times() {
		return times;
	}

	/**
	 * retunerar storleken på Icon arrayen.
	 */
	public int size() {
		return list.size();
	}

	/**
	 * retunerar nästa objekt i Icon arrayen.
	 */
	public Icon nextIcon() {
		if (list.size() == 0)
			return null;
		currentIcon = (currentIcon + 1) % list.size();
		return list.get(currentIcon);
	}

}
