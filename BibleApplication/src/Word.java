import java.util.ArrayList;


public class Word {
	
	private String wordValue;
	private int wordCount;
	private Location location;
	
	private ArrayList<Location> locationList;
	
	public Word(String word)
	{	
		wordValue = word;
		locationList = new ArrayList<>();
			
	}
	
	public void updateLocList(Verse v)
	{
		//locationList.add(v.getLocation().getLocation().getName(), v.getLocation().getIndex(), v.getIndex());
	}

	public void incrementWordCount()
	{
		wordCount++;
	}
	
	public String toString()
	{
		return wordValue;
	}
	
}
