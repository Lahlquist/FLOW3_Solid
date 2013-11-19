
package flow3_solid;

/**
 * Flow 3 - "Solid"
 * Udarbejdet af:
 * Søren og Laura
 * Onsdag 06.11.2013 #Part 1
 * Tirsdag 19.11.2013 #Part 2
 */

//Dette Java Interface ... ?????????
public interface QuizzControlIF extends WordPairControlIF
{
    // rev hau 9-10-2013
    // rev hau 5-11-2012

    /**
    * Returns a list of names of selectable games 
    */
    String[] getGameNames();

    /**
    * Pre: The name passed corresponds to a selectable game
    * Post: The existing collection of word pairs is cleared.
    */
    void selectGame(String gameName);

    /**
    * Returns the name of the game presently selected. If no game is selected it returns null.
    */
    String getSelectedGameName();

    /**
    * Post: A new game with the passed name is created
    * Returns false if a game with the passed name allready exists. Otherwise true.
    */
    boolean addGame(String name);

    /**
    * Returns the answer corresponding to the passed question. 
    * If the question word does not exist null is returned  
    * If a game has not been selected null is returned (NB! Extra)
    */
    String lookup(String question);
}