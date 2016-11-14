package p5;

/**
 * 
 * @author Emeli Pettersson
 *
 */
public class TestDice {

	/**
	 * Tar emot tärning och även antalet kast på tärningen. Sedan hämtas antalet sidor och 
	 * en iteration körs för att simulera samtliga kast. Sist skrivs resultatet ut. 
	 * @param dice
	 * @param nbrOfThrows
	 */
	public static void test(Dice dice, int nbrOfThrows) {
		int[] results = new int[dice.getSides()];
		for (int i = 0; i < nbrOfThrows; i++) {
			int res = dice.throwDice();
			results[res - 1] = results[res - 1] +1;
		}
		for (int i = 0; i < results.length; i++) {
			TextWindow.println((i + 1) + "   " + results[i]);
		}
	}

	/**
	 * Skapar ett antal kast och skriver ut resultaten av kasten.
	 * Gör ovkså en kontroll i if-satser av vilken spelare det gäller, hämtar sedan
	 * tärningar och dess sidor genom getDice();
	 * @param player
	 * @param nbrOfThrows
	 */
	public static void test(Player player, int nbrOfThrows) {
		int[] results;
		Dice dice = null;
		if (player instanceof Cheater) {
			Cheater pl = (Cheater) player;
			dice = pl.getDice();
		} else if (player instanceof OrdinaryPlayer) {
			OrdinaryPlayer pl = (OrdinaryPlayer) player;
			dice = pl.getDice();
		}
		results = new int[dice.getSides()];

		for (int i = 0; i < nbrOfThrows; i++) {
			int re = player.throwDice();
			results[re - 1]++;
		}
		for (int i = 0; i < results.length; i++) {
			TextWindow.println((i + 1) + "   " + results[i]);
		}

	}

}

