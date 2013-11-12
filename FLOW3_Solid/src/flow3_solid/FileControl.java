
package flow3_solid;

//Herunder ses de Java-klasser vi har importeret fra Java's bibliotek:
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Flow 3 - "Solid"
 * Udarbejdet af:
 * Søren og Laura
 * Onsdag 06.11.2013 #Part 1
 * Tirsdag 19.11.2013 #Part 2
 */

//Denne klasse indeholder metoderne ”load” og ”save”, som har at gøre med ArrayListen og tekstfilen.
public class FileControl
{
    //Herunder erklæres metoden "load".
    public boolean load(ArrayList<WordPair> wordpairs)
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
    
    //Herunder erklæres metoden "save".
    public boolean save(ArrayList<WordPair> wordpairs)
    {
        PrintWriter pw;
        
        try
        {
            pw = new PrintWriter("/Users/Ahlquist/NetBeansProjects/FLOW3_Solid/wordPair.txt");
            
            for(int i = 0; i < wordpairs.size(); i++)
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
    
    //
    public String getGameNames(ArrayList<Game> games)
    {
        Scanner scan = null;
        
        try
        {
            scan = new Scanner(new FileReader("/Users/Ahlquist/NetBeansProjects/FLOW3_Solid/games.txt"));
        }
        
        catch (FileNotFoundException ex)
        {
            return "";
        }
        
        while(scan.hasNext())
        {
             String str = scan.nextLine();
             String[] theGames = str.split(",");
             Game g = new Game(theGames[0]);
             games.add(g);
        }
        return "";
    }
}
