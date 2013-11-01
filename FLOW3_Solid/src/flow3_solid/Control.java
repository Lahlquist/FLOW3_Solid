
package flow3_solid;

//Herunder ses de Java-klasser vi har importeret fra Java's bibliotek:
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Flow 3 - "Solid"
 * Udarbejdet af:
 * Søren og Laura
 * Onsdag 06.11.2013
 */

public class Control
{
    //
    private ArrayList<WordPair> wordpairs;
    
    //Herunder ses konstruktøren "Control":
    public Control()
    {
           wordpairs = new ArrayList();
           wordPairsToArrayList();
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
    public void wordPairsToArrayList()
    {
        Scanner scan = null;
        
        try
        {
            scan = new Scanner(new FileReader("/Users/Ahlquist/NetBeansProjects/FLOW3_Solid/wordPair.txt"));
        }
        
        catch (FileNotFoundException ex)
        {
            System.out.println("Fejl: " + ex.getMessage());
        }
        
        while(scan.hasNext())
        {
             String str = scan.nextLine();
             String[] words = str.split(",");
             WordPair wp = new WordPair(words[0], words[1]);
             wordpairs.add(wp);
        }
    }
    
    //
    public void saveFile()
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
    }   
}
