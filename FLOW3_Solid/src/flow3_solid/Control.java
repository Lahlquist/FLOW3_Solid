
package flow3_solid;

/**
 * Flow 3 - "Solid"
 * Udarbejdet af:
 * Søren og Laura
 * Onsdag 06.11.2013 #Part 1
 * Tirsdag 19.11.2013 #Part 2
 */

//Denne klasse indeholder alle de metoder, der er beskrevet i de to interfaces.
public class Control implements QuizzControlIF
{
    //Herunder ses denne klasses attributter.
    private FileControl fileControl;
    private WordPairList wordPairList;
    private GameList gameList;
    private String currentGame;
    
    //Herunder ses konstruktøren "Control".
    public Control()
    {
        //Herunder instantieres klasserne "FileControl", "WordPairList" og "GameList".
        fileControl = new FileControl();
        wordPairList = new WordPairList();
        gameList = new GameList();
        
        //Metoden "findGames" kaldes på klassen "FileControl" med metoden "getGames" som parameter.
        fileControl.findGames(gameList.getGames());
    }
    
    //Herunder erklæres metoden "load", der kalder metoden "load" på klassen "FileControl".
    @Override
    public boolean load()
    {
        if(currentGame != null)
        {
            return fileControl.load(wordPairList.getWordPairs(), currentGame);
        }
        else
        {
            return false;
        }
    }
    
    @Override
    public boolean save()
    {
        return fileControl.save(wordPairList.getWordPairs(), currentGame);
    }
    
    @Override
    public void add(String englishWord, String danishWord)
    {
        wordPairList.add(englishWord, danishWord);
    }
    
    @Override
    public int size()
    {
        return wordPairList.size();
    }
    
    @Override
    public boolean delete(String question)
    {
        return wordPairList.delete(question);
    }
    
    @Override
    public void clear()
    {
        wordPairList.clear();
    }
    
    @Override
    public String getRandomQuestion()
    {
        return wordPairList.getRandomQuestion();
    }
    
    @Override
    public boolean checkGuess(String question, String guess)
    {
        return wordPairList.checkGuess(question, guess);
    }
    
    @Override
    public String lookup(String question)
    {
        if(currentGame != null)
        {
            return wordPairList.lookup(question);
        }
        else
        {
            return null;
        }
    }
    
    @Override
    public boolean addGame(String name)
    {
        boolean status = gameList.addGame(name);
        
        if(status)
        {
            fileControl.createGame(name);
        }
        return status;
    }
    
    @Override
    public String[] getGameNames()
    {
        return gameList.getGameNames();
    }
    
    @Override
    public void selectGame(String gameName)
    {
        wordPairList.clear();
        this.currentGame = gameName;
    }
    
    @Override
    public String getSelectedGameName()
    {
        return currentGame;
    }
}