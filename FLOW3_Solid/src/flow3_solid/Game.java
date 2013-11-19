
package flow3_solid;

/**
 * Flow 3 - "Solid"
 * Udarbejdet af:
 * Søren og Laura
 * Onsdag 06.11.2013 #Part 1
 * Tirsdag 19.11.2013 #Part 2
 */

//Denne klasse indeholder "get'ere" og "set'ere" for et spil's navn.
public class Game
{
    //Her ses klassens attribut.
    private String name;
    
    //Herunder ses klassens konstruktør "Game".
    public Game(String name)
    {
        this.name = name;
    }
    
    //Herunder erklæres metoden "toString".
    @Override
    public String toString()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
}
