
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

public class Control implements WordPairControlIF
{
    //
    private FileControl fileControl;
    private ArrayList<WordPair> wordpairs;
    private String question;
    
    //Herunder ses konstruktøren "Control":
    public Control()
    {
           wordpairs = new ArrayList();
           fileControl = new FileControl();
    }
    
    //Herunder ses metoden "addWordPair":
    public void addWordPair(String englishWord, String danishWord)
    {
        //"WordPair"-klassen instantieres, og der oprettes et nyt objekt kaldet "wordPair".
        WordPair wordPair = new WordPair(englishWord, danishWord);
        
        //Objektet "wordPair" tilføjes til ArrayListen "wordpair".
        wordpairs.add(wordPair);
    }
    
    
    public boolean load()
    {
        return fileControl.load(wordpairs);
    }
    
    //
    public boolean save()
    {
        return fileControl.save(wordpairs);
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
    
    //
    public boolean checkGuess(String question, String guess)
    {
        //
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
    
    //
    public String lookup(String question)
    {
        //
        String answer = "Nothing";
        int i = 0;
        boolean found = false;
        while(i <= wordpairs.size() && found == false)
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
    
    //
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
                 save();
                 return true;
            }
                
            if(question.equalsIgnoreCase(wordpairs.get(i).getEnglishWord()))
            {
                wordpairs.remove(i);
                save();
                return true;
            }
        }
        return false;
    }
    
    public void clear()
    {
        wordpairs.clear();
        save();
    }
}