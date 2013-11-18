
package flow3_solid;

/**
 * Flow 3 - "Solid"
 * Udarbejdet af:
 * Søren og Laura
 * Onsdag 06.11.2013 #Part 1
 * Tirsdag 19.11.2013 #Part 2
 */

//Denne klasse har ansvaret for at køre GUI og instantierer Control-klassen.
public class App
{
    //Herunder ses main-metoden.
    public static void main(String[] args)
    {
        //"Control"-klassen instantieres, og der oprettes derved et nyt objekt kaldet "c".
        Control c = new Control();
        
        //"GUI" instantieres, og sættes derefter til at være synlig ved at kalde metoden "setVisible".
        GUI gui = new GUI(c);
        gui.setVisible(true);
        
    }
}
