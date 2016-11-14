/*
 * Lab1Exercise2.java
 * Skapad den 2 september 2014
 */

/**
 * Programmet skriver text i Console-fönstret.
 * 
 * @author Rolf axelsson
 * @version 1.0
 */
public class Lab1Exercise2 {

    /*
     * Metoden gör 4 utskrifter i Console-fönstret.
     * Instruktionerna utförs uppifrån och ned.
     */
    public void calculation() {
    	System.out.println("   366"); //A
        System.out.println("-   55"); //B
        System.out.println("------"); //C 
        System.out.println("   311"); //D
        
       
        
    }

    /*
     * Instruktionerna i main-metoden utförs då programmet exekveras.
     * Instruktionerna utförs uppifrån och ned.
     */
    public static void main( String[] args ) {
    	
        Lab1Exercise2 ex2 = new Lab1Exercise2(); //E
        
        ex2.calculation(); //F
        
        System.out.println("");
        System.out.println("ONE MORE TIME!!!");
        System.out.println("");
        
        ex2.calculation();
        
    }
}