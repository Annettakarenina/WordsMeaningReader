package exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class WordsReader {
	
	static String path = "src\\main\\java\\config\\WordsMeaning.properties";

	public static void main(String[] args) throws IOException {
		
		System.out.println(doesFileExists(path));
		
		readWords("Apple");
		readWords("Table");
		readWords("Orange");
//I could not figure how to make word.equalsIgnoreCase here
	}

	public static boolean doesFileExists(String path) throws IOException {

		File file=new File(path);
		InputStream input = new FileInputStream("src\\main\\java\\config\\WordsMeaning.properties");
		Properties prop = new Properties();
		prop.load(input);
		
		if (file.exists())
			return true;
		else
			return false;
	}
	
	public static void readWords(String word) throws IOException {
			
			File file=new File(path);
			InputStream input = new FileInputStream("src\\main\\java\\config\\WordsMeaning.properties");
			Properties prop = new Properties();
			prop.load(input);

			String key = prop.getProperty(word);
			String[] values = key.split(",");
			System.out.println(word);
			for (String i : values) {
				System.out.println(i);
			}
	}


	
	
}
