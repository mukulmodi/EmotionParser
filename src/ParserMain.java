import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class ParserMain
{

	public static void main(String[] args)
	{
		Parser emotionParser = new Parser("emotions.txt");
		emotionParser.analyzeText("I am sad");
		emotionParser.printHash();
		//readString(testPhrase);
	}

}
