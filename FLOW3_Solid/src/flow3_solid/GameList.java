
package flow3_solid;

//Herunder ses de Java-klasser vi har importeret fra Java's bibliotek:
import java.util.ArrayList;

/**
 * Flow 3 - "Solid"
 * Udarbejdet af:
 * Søren og Laura
 * Onsdag 06.11.2013 #Part 1
 * Tirsdag 19.11.2013 #Part 2
 */

public class GameList
{
    private ArrayList<Game> games;
    private String name;
    private Game game;
    
    public GameList()
    {
        games = new ArrayList<>();
        game = new Game(name);
    }
    
    public ArrayList<Game> getGames()
    {
        return games;
    }
    
    public boolean addGame(String name)
    {
        if(isANewGameName(name))
        {
            Game theGameName = new Game(name);
            games.add(theGameName);
        }
        return false;
    }

    private boolean isANewGameName(String name)
    {
        boolean newGameName = true;
        
        for(int i = 0; i < games.size(); i++)
        {
            if(games.get(i).getName().equals(name))
                newGameName = false;
        }
        return newGameName;
    }
    
    public String[] getGameNames()
    {
        String[] arr;
        arr = new String[games.size()];
        
        for(int i = 0; i<games.size(); i++)
        {
            arr[i] = games.get(i).getName();
        }
        return arr;
    }
    
    //* Returns the name of the game presently selected. If no game is selected it returns null.
//    public String getSelectedGameName()
//    {  
//        
//    }
//    
//    * Returns the answer corresponding to the passed question. 
//    * If the question word does not exist null is returned  
//    * If a game has not been selected null is returned (NB! Extra)
//    public String lookup(String question)
//    {
//        
//    }
}
