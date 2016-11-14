/*
 * Lab1Exercise1.java
 * Skapad den 2 september 2014
 */
import javax.swing.JOptionPane;

/**
 * Programmet skriver ut "Ett java-program" med hj‰lp av ett dialogfˆnster.
 * 
 * @author Rolf axelsson
 * @version 1.0
 */
public class Lab1Exercise1 {

    /*
     * Metoden visar ett par meddelande med olika dialogfönster
     */
    public void message() {
        // Ett dialogfönster öppnas med meddelandet "Ett java-program skrivet at mig"
        JOptionPane.showMessageDialog( null, "Ett java-program skrivet av mig" );
        // Ett dialogfönster öppnas med meddelandet "när du klickar OK stängs programmet"
        JOptionPane.showMessageDialog( null, "När du klickar OK stängs programmet" );
    }

    /*
     * Instruktionerna i main-metoden utfˆrs dÂ programmet exekveras.
     * main-metoden har endast tvÂ instruktioner.
     * - den fˆrsta instruktionen skapar ett objekt av typen Lab2Exercise1
     * - den andra instruktionen anropar metoden message i det nyss skapade objektet
     */
    public static void main( String[] args ) {
        Lab1Exercise1 prog = new Lab1Exercise1();
        prog.message();
    }
}
