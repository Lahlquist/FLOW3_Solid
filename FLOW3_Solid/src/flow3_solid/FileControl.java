
package flow3_solid;

//Herunder ses de Java-klasser vi har importeret fra Java's bibliotek:
import java.io.File;
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
    public void findGames(ArrayList<Game> games)
    {
        String name = "";
        String path = ".";

        String fileName = null;
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++)
        {
            if (listOfFiles[i].isFile())
            {
                fileName = listOfFiles[i].getName();
                
                if (fileName.endsWith(".txt") || fileName.endsWith(".TXT"))
                {
                    for(int j = 0; j<fileName.length(); j++)
                    {
                        if(fileName.charAt(j) == '.')
                        {
                            name = fileName.substring(0, j);
                            Game game = new Game(name);
                            games.add(game);
                            System.out.println(games);
                        }
                    }
                }
            }
        }
    }
    
    //Herunder erklæres metoden "load".
    public boolean load(ArrayList<WordPair> wordpairs)
    {
        Scanner scan = null;
        
        try
        {
            scan = new Scanner(new FileReader("WordPair.txt"));
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
            pw = new PrintWriter("wordPair.txt");
            
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
    
    //Herunder erklæres metoden "createGame".
    public boolean createGame(String name)
    {
        PrintWriter pw;
        
        try
        {
            pw = new PrintWriter(name+".txt");
            pw.println(name);
            
            pw.close(); 
        }
        
        catch (FileNotFoundException ex)
        {
            System.out.println("Fejl: " + ex.getMessage());
        }
        return true;
    }
    
}
