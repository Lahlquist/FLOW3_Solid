
package flow3_solid;

/**
 * Flow 3 - "Solid"
 * Udarbejdet af:
 * Søren og Laura
 * Onsdag 06.11.2013 #Part 1
 * Tirsdag 19.11.2013 #Part 2
 */

//Denne klasse indeholder ”get’ere” og ”set’ere” for det engelske og det danske ord.
public class WordPair
{
    //Herunder ses denne klasses attributter.
    private String englishWord;
    private String danishWord;
    
    //Herunder ses konstruktøren "WordPair".
    public WordPair(String englishWord, String danishWord)
    {
        this.englishWord = englishWord;
        this.danishWord = danishWord;
    }

    //Herunder erklæres metoden "toString".
    @Override
    public String toString()
    {
        return englishWord + "," + danishWord;
    }
    
    //Herunder ses "set'ere" og "get'ere" for englishWord og danishWord.
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
