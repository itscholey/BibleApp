/**
 * Class to model each individual verse in the bible.
 * This will store each word of the verse. 
 */
public class Verse {
	private String line;
	private int index;
	
	public Verse(int i, String l)
	{
		line = l;
		index = i;
	}
	
	/**
	 * A method to add a word to this verse collection.
	 * @param The word to be added to the collection.
	 */
	
	public void addWord(String word)
	{
		line += word;	
	}
	
	public String getVerse()
	{
		return line;
	}


}
