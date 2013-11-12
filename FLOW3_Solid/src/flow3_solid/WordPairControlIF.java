
package flow3_solid;

/**
 * Flow 3 - "Solid"
 * Udarbejdet af:
 * Søren og Laura
 * Onsdag 06.11.2013 #Part 1
 * Tirsdag 19.11.2013 #Part 2
 */

//Dette Java Interface indeholder alle de metoder, der var fastlagt fra starten,
//og som vi derfor skulle implementere i vores ”Control”-klasse,
//for at det er muligt at bytte GUI med andre grupper.
public interface WordPairControlIF
{
    /** 
     * Post: A new word pair is added to the existing collection of word
     * pairs
     */
    void add(String englishWord, String danishWord);

    /**  
     * Post: A word pair corresponding to the question is removed from the collection.
     * Returns true if a word pair is removed. Otherwise false.
     */
    boolean delete(String question);

    /**
     * Returns the number of wordpairs
     */
    int size();

    /**
     * Pre: At least one word pair must be present
     * Returns a question randomly selected from the collection of word pairs
     */
    String getRandomQuestion();

    /** 
     * Returns true if (question, quess) exists as a word pair in the
     * collection, otherwise false
     */
    boolean checkGuess(String question, String quess);

    /**
     * Returns the answer corresponding to the question if this
     * exists in the collection. Otherwise it returns null.
     */
    String lookup(String question);

    /** 
     * Post: Word pairs are read from file and added to the
     * collection of word pairs. 
     * Returns true if successfully done. Otherwise false.
     */
    boolean load();

    /**
     * Post: All word pairs from the collection has been written to file
     * Returns true if successfully done. Otherwise false.
     */
    boolean save();

    /**
     * Post: The existing collection of word pairs is cleared
     */
    void clear();
}
