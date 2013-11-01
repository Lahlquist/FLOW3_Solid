/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flow3_solid;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Ahlquist
 */
public class WordPair
{
    private String englishWord;
    private String danishWord;
    
    Control control = new Control();
    
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
