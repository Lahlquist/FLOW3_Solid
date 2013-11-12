
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
 * Onsdag 06.11.2013 #Part 1
 * Tirsdag 19.11.2013 #Part 2
 */

//Denne klasse ”peger” på alle de metoder der findes i programmet, men som er erklæret i andre klasser.
public class Control implements WordPairControlIF //implements QuizzControlIF
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
    
    //Herunder erklæres metoden "load" der kalder metoden "load" på klassen "FileControl".
    public boolean load()
    {
        return fileControl.load(wordPairList.getWordPairs());
    }
    
    public boolean save()
    {
        return fileControl.save(wordPairList.getWordPairs());
    }
    
    public void add(String englishWord, String danishWord)
    {
        wordPairList.add(englishWord, danishWord);
    }
    
    public int size()
    {
        return wordPairList.size();
    }
    
    public boolean delete(String question)
    {
        return wordPairList.delete(question);
    }
    
    public void clear()
    {
        wordPairList.clear();
    }
    
    public String getRandomQuestion()
    {
        return wordPairList.getRandomQuestion();
    }
    
    public boolean checkGuess(String question, String guess)
    {
        return wordPairList.checkGuess(question, guess);
    }
    
    public String lookup(String question)
    {
        return wordPairList.lookup(question);
    }
}