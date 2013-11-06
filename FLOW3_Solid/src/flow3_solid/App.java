/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flow3_solid;

/**
 *
 * @author Ahlquist
 */
public class App
{
    public static void main(String[] args)
    {
        //Herunder instantieres "Control"-klassen, og der oprettes derved et nyt objekt kaldet "control".
        Control c = new Control();
        
        //
        GUI gui = new GUI(c);
        gui.setVisible(true);
    }
}
