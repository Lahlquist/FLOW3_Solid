
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
    private ArrayList<WordPair> wordpairs;
    private String question;
    
    //Herunder ses konstruktøren "Control":
    public Control()
    {
           wordpairs = new ArrayList();
    }
    
    //Herunder ses metoden "addWordPair":
    public void addWordPair(String englishWord, String danishWord)
    {
        //"WordPair"-klassen instantieres, og der oprettes et nyt objekt kaldet "wordPair".
        WordPair wordPair = new WordPair(englishWord, danishWord);
        
        //Objektet "wordPair" tilføjes til ArrayListen "wordpair".
        wordpairs.add(wordPair);
    }
    
    //Herunder ses metoden "wordPairsToArrayList":
    public boolean load()
    {
        Scanner scan = null;
        
        try
        {
            scan = new Scanner(new FileReader("/Users/Ahlquist/NetBeansProjects/FLOW3_Solid/wordPair.txt"));
        }
        
        catch (FileNotFoundException ex)
        {
            return false;
        }
        
        while(scan.hasNext())
        {
             String str = scan.nextLine();
             String[] words = str.split(",");
             WordPair wp = new WordPair(words[0], words[1]);
             wordpairs.add(wp);
        }
        return true;
    }
    
    //
    public boolean save()
    {
        PrintWriter pw;
        
        try
        {
            pw = new PrintWriter("/Users/Ahlquist/NetBeansProjects/FLOW3_Solid/wordPair.txt");
            
            for (int i = 0; i < wordpairs.size(); i++)
            {
                pw.println(wordpairs.get(i).toString());
            }
            
            pw.close(); 
        }
        
        catch (FileNotFoundException ex)
        {
            System.out.println("Fejl: " + ex.getMessage());
        }
        return true;
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
        String answer = "";
        
        for(int i = 0; i < wordpairs.size(); i++)
        {
            if(question.equalsIgnoreCase(wordpairs.get(i).getDanishWord()))
            {
                answer = wordpairs.get(i).getEnglishWord();
            }
                
            if(question.equalsIgnoreCase(wordpairs.get(i).getEnglishWord()))
            {
                answer = wordpairs.get(i).getDanishWord();
            }
            
            else
            {
                answer = "Nothing";
            }
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
    
    public void warningBox(String s)
    {
        JOptionPane.showConfirmDialog(null, s);
        
        for(int i = -1; i < 3; i++)
        {
        
        if(i == JOptionPane.YES_OPTION)
        {
            clear();
        }
        else if(i == JOptionPane.NO_OPTION)
        {
            save();
        }
        else if(i == JOptionPane.CANCEL_OPTION)
        {
            save();
        }
        else if(i == JOptionPane.CLOSED_OPTION)
        {
            save();
        }
        }
    }
}