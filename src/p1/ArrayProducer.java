package p1;

import javax.swing.Icon;

/**
 * Klassen tar emot en {@link Icon} array och navigerar igenom denna via
 * {@link ArrayProducer#nextIcon()} metoden. Den hanterar även delay tiden under
 * exekvering, antalet gånger vi ska skicka olika objekt och storleken på Icon
 * arrayen.
 * 
 * @author Krallan
 *
 */

public class ArrayProducer implements IconProducer {
	private Icon[] icons;
	private int delay = 0;
	private int times = 0;
	private int currentIndex = -1;

	/**
	 * Instansierar ArrayProducer.
	 * 
	 * @param icons
	 *            {@link Icon}-array
	 * @param delay
	 *            fördröjning
	 * @param times
	 *            gånger att överföra objekt
	 */
	public ArrayProducer(Icon[] icons, int delay, int times) {
		this.delay = delay;
		this.times = times;
		this.icons = icons;
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
		return (icons == null) ? 0 : icons.length;
	}

	/**
	 * retunerar nästa objekt i Icon arrayen.
	 */
	public Icon nextIcon() {
		if (icons == null || icons.length == 0)
			return null;
		currentIndex = (currentIndex + 1) % icons.length;
		return icons[currentIndex];
	}

}
