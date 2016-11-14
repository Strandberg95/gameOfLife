package p5;

/**
 * 
 * @author Emeli Pettersson
 *
 */

public class OrdinaryPlayer extends Player{

	private Dice dice;

	/** 
	 * Kontruktorn tar emot spelarens namn, skaparn en spelare och tilldelar en tärning med sex sidor.
	 * @param playerName
	 */
	public OrdinaryPlayer (String playerName){
		super(playerName);
		dice = new SimpleDice();
	}

	/** 
	 * Konstruktorn tar emot spelarens namn men tar också emot en redan skapad tärning som skall användas.
	 * @param playerName
	 * @param pDice
	 */
	public OrdinaryPlayer (String playerName, Dice pDice){
		super(playerName);
		dice = pDice;
	}

	/**
	 * Returnerar ett tärningskast genom metoden throwDice på variabeln dice.
	 * @return resultatet av ett kast med spelarens tärning.
	 */
	public int throwDice(){
		return dice.throwDice();
	}

	/**
	 * Tar emot en tärning och tilldelar den till variabeln dice.
	 * @param sDice
	 */
	public void setDice(Dice sDice){
		dice=sDice;

	}

	/**
	 * Returnerar variabeln som används (dice).
	 * @return dice
	 */
	public Dice getDice(){
		return dice;
	}

}
