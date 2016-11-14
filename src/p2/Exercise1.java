package p2;

import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Exercise1 {

	/*
	 * Metoden beräknar totala biljettpriset och det genomsnittliga
	 * biljettpriset för ett antal vuxna, barn och pensionärer.
	 **/
	public void exercise1a() {
		// Kallar p� metoden exercise1a
		int barn, vuxen, pensionär, pris, medelpris, pris1, pris2, pris3;

		// Deklarerar en variabel
		pris1 = 60;
		pris2 = 110;
		pris3 = 80;

		// tilldelar variabeln ett v�rde
		barn = Integer.parseInt(JOptionPane.showInputDialog("Ange antalet barn "));
		vuxen = Integer.parseInt(JOptionPane.showInputDialog("Ange antalet vuxna "));
		pensionär = Integer.parseInt(JOptionPane.showInputDialog("Ange antalet pension�rer "));

		// Fr�gar anv�ndaren om inputs samt du g�r om int till en str�ng
		pris = (pris1 * barn) + (pris2 * vuxen) + (pris3 * pensionär);
		// Man tilldelar variabeln "pris" ett v�rde (i detta fall en utr�kning
		// med de andra variablerna)
		medelpris = pris / (barn + vuxen + pensionär);
		// H�r tilldelar man variabeln "medelpris" ett v�rde i form utav en
		// utr�kning
		JOptionPane.showMessageDialog(null,
				"Totala priset �r: " + pris + "kr\n" + "Genomsnittspriset �r: " + medelpris + " kr");
		// Genom klassen JOptionPane kallar vi p� en metod, i detta fall en
		// dialogruta. Detta g�r d� vi har static.

	}

	public void exercise1b() {
		for (int i = 1; i < 100; i += 2) {
			// Tilldelar variabeln i en int, s�tter ett villkor f�r i
			// (villkorssats)
			// Samt stegar med +2, vilket resulterar i att vi kommer se alla
			// udda tal fr�n 1 till 100.
			System.out.print(i + " ");
			// Skriver ut det som sker i forloopen, variabelns d�varande v�rde.
		}
	}

	public void exercise1c() {
		int number;
		// hade �ven kunnat skriva "for (int i = 1; i <= 4; i++) {" men tyckte
		// detta var lite roligare samt att man fick t�nka mer
		for (int i = 2; i <= 8; i += 2) {

			number = Integer.parseInt(JOptionPane.showInputDialog("Ange ett slumpm�ssigt heltal"));
			if (number > 0) {
				System.out.println("Talet �r " + number + " positivt");
			}
			if (number < 0) {
				System.out.println("Talet �r " + number + " negativt");
			}
			if (number == 0) {
				System.out.println("Talet �r " + number + " noll");

				// Man deklararerar variabeln number i form av en int.
				// Man startar en forloop som k�rs 4 g�nger. Sen g�r man om en
				// int till en str�ng i samband med en inputdialog. D� man
				// beh�ver input
				// fr�n anv�ndaren. D�refter k�rs de olika ifsatserna beroende
				// p� vilka villkor det �r som g�ller. Oavsett ifsats s� skrivs
				// input-
				// v�rdet ut i form utav en str�ng med text.
			}
		}

	}

	public void exercise1d() {
		int min, max;
		min = Integer.parseInt(JOptionPane.showInputDialog("Ange minsta v�rdet"));
		max = Integer.parseInt(JOptionPane.showInputDialog("Ange st�rsta v�rdet"));
		for (int i = min; i <= max; i += 7) {
			if (i+7 > max )     
				System.out.print(i + " ");
			else 
			System.out.print(i + " , ");

			// Tilldelar 2 variabler, s�tter v�rde p� dessa variabler. D�r
			// v�rdet styrs utav inputen som anv�ndaren matar in.
			// Initierar en forloop, d�r "min" s�tts till l�gsta v�rde, s�tter
			// ett villkor f�r de tv� variablerna, inleder en stegning p� 7.
			// V�rdena som loopas skrivs sedan ut i str�ngen (datorsk�rmen).
		}
	}

	public void exercise1e() {
		PaintWindow pw = new PaintWindow();
		Random rand = new Random();
		ImageIcon image = new ImageIcon("/Users/Strandberg95/Desktop/Programming/Bilder/ship.png");
		int width = pw.getBackgroundWidth();
		int height = pw.getBackgroundHeight();
		int dx = -100;
		int dy = 0;
		int x = 250;
		int y = rand.nextInt(height - 100);

		while (true) {
			pw.showImage(image, x, y);
			PaintWindow.pause(20);
			x += dx;
			y += dy;
			if (x < 0) {
				dx = -dx;
			}
			if (x > width-image.getIconWidth()) {
				dx = -dx;
			}
		}
	}

	public void exercise1f() {
		PaintWindow pw = new PaintWindow();
		Random rand = new Random();
		ImageIcon image = new ImageIcon("/Users/Strandberg95/Desktop/Programming/Bilder/ship.png");
		ImageIcon image1 = new ImageIcon("/Users/Strandberg95/Desktop/Programming/Bilder/ship.png");
		int width = pw.getBackgroundWidth();
		int height = pw.getBackgroundHeight();
		int dx = rand.nextInt(8 - (-8));
		int dy = rand.nextInt(9 - (-9));
		// Ger ut en slumpm�ssig riktning
		int x = rand.nextInt(width - 100);
		int y = rand.nextInt(height - 100);
		// Ger ut en slumpm�ssig startpunkt

		while (true) {
			pw.showImage(image, x, y);
			pw.showImage(image1, x, y);
			PaintWindow.pause(20);

			x += dx;
			y += dy;

			if (x < 0) {
				dx = -dx;
			}
			if (x > 900) {
				dx = -dx;

			}
			if (y < 0) {
				dy = -dy;
			}
			if (y > 500) {
				dy = -dy;
			}

		}

	}

}
