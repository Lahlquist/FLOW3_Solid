
package flow3_solid;

//Herunder ses de Java-klasser vi har importeret fra Java's bibliotek:
import java.util.ArrayList;
import java.util.Random;

/**
 * Flow 3 - "Solid"
 * Udarbejdet af:
 * Søren og Laura
 * Onsdag 06.11.2013 #Part 1
 * Tirsdag 19.11.2013 #Part 2
 */

//Denne klasse indeholder alle de metoder, som har at gøre med ArrayListen.
public class WordPairList
{
    //Herunder ses denne klasses attributter.
    private ArrayList<WordPair> wordpairs;
    private String question;
    private WordPair wordPair;
    
    //Herunder ses konstruktøren "WordPairList", hvori der sker to instantieringer.
    public WordPairList()
    {
        wordpairs = new ArrayList<>();
        wordPair = new WordPair(question, question);
    }
    
    //Herunder erklæres metoden "getWordPairs".
    public ArrayList<WordPair> getWordPairs()
    {
        return wordpairs;
    }
    
    //Denne metode tilføjer "wordPair" til ArrayListen.
    public void add(String englishWord, String danishWord)
    {
        WordPair newWordPair = new WordPair(englishWord, danishWord);
        wordpairs.add(newWordPair);
    }
    
    public int size()
    {
        return wordpairs.size();
    }
    
    //Denne metode vil slette et ordpar fra ArrayListen og tekstfilen.
    public boolean delete(String question)
    {
        for(int i = 0; i < wordpairs.size(); i++)
        {
            if(question.equalsIgnoreCase(wordpairs.get(i).getDanishWord()))
            {
                wordpairs.remove(i);
                return true;
            }
                
            if(question.equalsIgnoreCase(wordpairs.get(i).getEnglishWord()))
            {
                wordpairs.remove(i);
                return true;
            }
        }
        return false;
    }
    
    //Denne metode vil slette hele ArrayListen og hele tekstfilen.
    public void clear()
    {
        wordpairs.clear();
    }
    
    public String getRandomQuestion()
    {
        Random randomWord = new Random();
        int randomNo = randomWord.nextInt(wordpairs.size());
        WordPair wp = wordpairs.get(randomNo);
        int a = randomWord.nextInt(2);
        
        if(a == 0)
        {
            question = wp.getEnglishWord();
        }
        else
        {
            if(a == 1)
            {
                question = wp.getDanishWord();
            }
        }
        return question;
    }
    
    public boolean checkGuess(String question, String guess)
    {
        for(int i = 0; i < wordpairs.size(); i++)
        {
            if(question.equalsIgnoreCase(wordpairs.get(i).getDanishWord()))
            {
                if(wordpairs.get(i).getEnglishWord().equalsIgnoreCase(guess))
                {
                    return true;
                }
            }
            
            if(question.equalsIgnoreCase(wordpairs.get(i).getEnglishWord()))
            {
                if(wordpairs.get(i).getDanishWord().equalsIgnoreCase(guess))
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public String lookup(String question)
    {
        String answer = "Nothing";
        int i = 0;
        boolean found = false;
        
        while(i < wordpairs.size() && found == false)
        {
            if(question.equalsIgnoreCase(wordpairs.get(i).getDanishWord()))
            {
                answer = wordpairs.get(i).getEnglishWord();
                found = true;
            }
                
            if(question.equalsIgnoreCase(wordpairs.get(i).getEnglishWord()))
            {
                answer = wordpairs.get(i).getDanishWord();
                found = true;
            }
            i++;
        }
        return answer;
    }
}
