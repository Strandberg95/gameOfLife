package p5;

import java.util.*;

/**
 * 
 * @author Emeli Pettersson
 *
 */
public class Cheater extends Player {
	private Dice dice;


	/**
	 * Konstruktorn skapar en spelare med ett namn som tas emot i en sträng.
	 * Den skapar också en tärning med 6 sidor.
	 * @param playerName
	 */
	public Cheater(String playerName) {
		super(playerName);
		dice = new SimpleDice(6);
	}

	/**
	 * Konstruktorn skapar en spelare med namnet som tas emot
	 * och med en tärning som tas emot i konstruktorn.
	 * @param playerName
	 * @param pDice
	 */
	public Cheater(String playerName, Dice pDice) {
		super(playerName);
		dice = pDice;
	}

	/**
	 * 	Metoden throwDice returnerar ett slumptal.
	 *  Om tärningen inte returnerar maxvärdet och det slumpmässigt returneras en true boolean,
	 *  fuskar spelaren genom att addera resultatet med 1, annars skickas bara resultatet.
	 *  @return results +1
	 *  @return results
	 */	
	public int throwDice() {
		Random rand = new Random();
		int result = dice.throwDice();
		if (result != dice.getSides()) {
			if (rand.nextBoolean()) {
				result = result + 1;
			}

		}
		return result;
	}

	/**
	 *  Metoden tar in en tärning och knyter den till spelaren.
	 *  @param sDice
	 */
	public void setDice(Dice sDice) {
		dice = sDice;

	}

	/**
	 * Metoden returnerar vilken tärning som spelaren använder sig av
	 * @return dice
	 */
	public Dice getDice() {
		return dice;
	}

}

