import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class ParserMain
{

	HashMap<String,Integer> emotionCount = new HashMap<String,Integer>();
	public static void main(String[] args)
	{
		String testPhrase = "I am happy";
		setMap();
		readString(testPhrase);
	}

	private static void readString(String phrase)
	{
		String[] words = phrase.split(" ");

	}
	private static void setMap()
	{
		String fileName = "emotion.txt";
		try
		{
			Scanner fileScan = new Scanner(new File(fileName));
			while(fileScan.hasNext())
			{

			}
		}
		catch (Exception FileNotFoundException)
		{
			System.out.println("Could not find or open file");
		}
	}
}
