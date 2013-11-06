
package flow3_solid;

/**
 * Flow 3 - "Solid"
 * Udarbejdet af:
 * Søren og Laura
 * Onsdag 06.11.2013
 */

//Denne klasse bruges kun til at igangsætte de andre klasser, så programmet kan køre.
public class App
{
    //Herunder ses main-metoden.
    public static void main(String[] args)
    {
        //"Control"-klassen instantieres, og der oprettes derved et nyt objekt kaldet "c".
        Control c = new Control();
        
        //"GUI" instantieres, og sættes derefter til at være synlig.
        GUI gui = new GUI(c);
        gui.setVisible(true);
    }
}
