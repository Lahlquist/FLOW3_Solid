
package flow3_solid;

import java.io.FileNotFoundException;
import java.io.FileReader;
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
    public Control()
    {
           
    }
    
    //
    private ArrayList<WordPair> wordpair = new ArrayList();
    
    //
    public void addWordPair(String englishWord, String danishWord)
    {
        WordPair wordPair = new WordPair(englishWord, danishWord);
        wordpair.add(wordPair);
        wordPairsToArrayList();
    }
    
    //
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
             wordpair.add(wp);
        }
    }
    
    //
    public void saveFile()
    {
        PrintWriter pw;
        
        try
        {
            pw = new PrintWriter("/Users/Ahlquist/NetBeansProjects/FLOW3_Solid/wordPair.txt");
            
            for (int i = 0; i < wordpair.size(); i++)
            {
                pw.println(wordpair.get(i).toString());
            }
            
            pw.close(); 
        }
        
        catch (FileNotFoundException ex)
        {
            System.out.println("Fejl: " + ex.getMessage());
        }
    }   
}
