
package flow3_solid;

//Herunder ses de Java-klasser vi har importeret fra Java's bibliotek:
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Flow 3 - "Solid"
 * Udarbejdet af:
 * Søren og Laura
 * Onsdag 06.11.2013
 */

//Denne klasse henviser til alle metoderne fra "WordPairControlIF"-klassen, der findes beskrevet i andre klasser.
public class Control implements WordPairControlIF
{
    //Herunder ses denne klasses attributter.
    private FileControl fileControl;
    private WordPairList wordPairList;
    
    //Herunder ses konstruktøren "Control".
    public Control()
    {
        //Herunder instantieres klasserne "FileControl" og "WordPairList".
        fileControl = new FileControl();
        wordPairList = new WordPairList();
    }
    
    //
    public boolean load()
    {
        return fileControl.load(wordPairList.getWordPairs());
    }
    
    //
    public boolean save()
    {
        return fileControl.save(wordPairList.getWordPairs());
    }
    
    //Metoden "addWordPair" hentes fra klassen "FileControl"
    public void addWordPair(String englishWord, String danishWord)
    {
        wordPairList.addWordPair(englishWord, danishWord);
    }
    
    //
    public int size()
    {
        return wordPairList.size();
    }
    
    //Denne metode vil slette et ordpar fra ArrayListen og tekstfilen.
    public boolean delete(String question)
    {
        boolean deleted = wordPairList.delete(question);
        if(deleted)
        {
            save();
        }
        return deleted;
    }
    
    //
    public void clear()
    {
        wordPairList.clear();
        save();
    }
    
    //
    public String getRandomQuestion()
    {
        return wordPairList.getRandomQuestion();
    }
    
    //
    public boolean checkGuess(String question, String guess)
    {
        return wordPairList.checkGuess(question, guess);
    }
    
    //
    public String lookup(String question)
    {
        return wordPairList.lookup(question);
    }
}