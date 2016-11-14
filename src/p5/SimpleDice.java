package p5;

import java.util.Random;

/**
 * 
 * @author Emeli Pettersson
 *
 */
public class SimpleDice implements Dice{

	private int sides = 0;
	private int results;
	private Random rand = new Random();

	/**
	 * Konstruktorn skapar en sexsidig tärning, som sätter normen. 
	 * Tilldelas det inte något värde i konstruktorn undertill, kvarbilr värdet enl. normen.
	 */
	public SimpleDice() {
		sides = 6;  
	}

	/**
	 * Konstruktorn tar emot en int och tilldelar värdet till variabeln sides
	 * som då avgör antalet sidor. Om värdet är mindre än noll kastas undantaget genom metoden
	 * NegativeSidesException();
	 * @param i
	 */
	public SimpleDice(int i) {
		if(i>0)
			sides = i;
		else
			throw new NegativeSidesException();
	}

	/**
	 * Gör ett kast med tärningen genom metoden diceThrow. 
	 * Skickar med antalet sidor i variabeln sides. Sedan returneras resultatet.
	 * @return result
	 */
	public int throwDice() {

		results = rand.nextInt(sides) + 1 ;
		return results; 
	}

	/**
	 * Returnerar antalet sidor på tärningen som lagrats sedan tidigare i variabeln sides.
	 * @return sides
	 */
	public int getSides() {
		return sides;
	}
}
