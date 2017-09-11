import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Parser
{

	HashMap<String,Integer> emotionCount; //HashMap that will update as the text is analyzed with the count of emotion words
	String emotionFile; //txt file containing all emotion words
	String parseText; //txt to be analyzed

	public Parser()
	{
		emotionCount = new HashMap<String,Integer>();
		emotionFile = "";
	}

	public Parser(String emotionText, String textToParse)
	{
		emotionCount = new HashMap<String,Integer>();
		emotionFile = emotionText;
		parseText = textToParse;

		makeHash();
	}

	/**
	 * Takes the given file containing emotion words and updates hashMap with all words and default count of 0
	 */
	private void makeHash()
	{
		try
		{
			Scanner fileScan = new Scanner(new File(emotionFile));
			while(fileScan.hasNext())
			{
				String word = fileScan.next();
				// System.out.println(word); //Takes word line by line, add that into hash
				emotionCount.put(word,0);
			}
		}
		catch (Exception FileNotFoundException)
		{
			System.out.println("Could not find or open file");
		}

	}

	/**
	 * debugging method, prints the hash to ensure that counts are updated correctly
	 */
	public void printHash()
	{
		for(String emotion: emotionCount.keySet())
		{
			int value = emotionCount.get(emotion);
			System.out.println(emotion + ": " + value);
		}
	}

	/**
	 * takes the given text to analyze, breaks into arrays, updates the hashMap with value counts of how many emotion words appear
	 */
	private void analyzeText()
	{
		String[] words = parseText.split(" "); // array of each word in the given text
		updateHash(words);
	}

	/**
	 * Helper method to update hashMap count from words in the given text
	 * @param words String array of each word from the given text to analyze
	 */
	private void updateHash(String[] words)
	{

	}

}
