/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package flow3_solid;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Søren
 */
public class FileControl
{
        
    public boolean load(ArrayList<WordPair> wordpairs)
    {
        Scanner scan = null;
        
        try
        {
            scan = new Scanner(new FileReader("wordPair.txt"));
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
    
    public boolean save(ArrayList<WordPair> wordpairs)
    {
        PrintWriter pw;
        
        try
        {
            pw = new PrintWriter("wordPair.txt");
            
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
}
