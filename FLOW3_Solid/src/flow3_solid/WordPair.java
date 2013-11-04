
package flow3_solid;

//Herunder ses de Java-klasser vi har importeret fra Java's bibliotek:
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Flow 3 - "Solid"
 * Udarbejdet af:
 * Søren og Laura
 * Onsdag 06.11.2013
 */

public class WordPair
{
    private String englishWord;
    private String danishWord;
    
    public WordPair(String englishWord, String danishWord)
    {
        this.englishWord = englishWord;
        this.danishWord = danishWord;
    }

    public String toString()
    {
        return englishWord + ", " + danishWord;
    }
    
    public void setEnglishWord(String englishWord)
    {
        this.englishWord = englishWord;
    }

    public void setDanishWord(String danishWord)
    {
        this.danishWord = danishWord;
    }

    public String getEnglishWord()
    {
        return englishWord;
    }

    public String getDanishWord()
    {
        return danishWord;
    }
}
