
package flow3_solid;

//Herunder ses den Java-klasse vi har importeret fra Java's bibliotek:
import java.util.ArrayList;

/**
 * Flow 3 - "Solid"
 * Udarbejdet af:
 * Søren og Laura
 * Onsdag 06.11.2013 #Part 1
 * Tirsdag 19.11.2013 #Part 2
 */

//Denne klasse indeholder alle de metoder, der har at gøre med ArrayListen, i forhold til de forskellige spil.
public class GameList
{
    //Herunder ses klassens attributter.
    private ArrayList<Game> games;
    private String name;
    private Game game;
    
    //Her ses konstruktøren "GameList".
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
            return true;
        }
        else
        {
            return false;
        }
    }

    private boolean isANewGameName(String name)
    {
        boolean newGameName = true;
        
        for(int i = 0; i < games.size(); i++)
        {
            if(games.get(i).getName().equalsIgnoreCase(name))
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
}
