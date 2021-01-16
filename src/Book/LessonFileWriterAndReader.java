package Book;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LessonFileWriterAndReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("temp.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		FileWriter fileWriter = new FileWriter(file);
		FileReader fileReader = new FileReader(file);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		bufferedWriter.append("Hello");
		bufferedWriter.newLine();
		bufferedWriter.append("My name is Andrey");
		bufferedWriter.newLine();
		bufferedWriter.append("Good Bye");
		bufferedWriter.flush();
		bufferedWriter.close();
		while(bufferedReader.ready()) {
			System.out.println(bufferedReader.readLine());
		}
		bufferedReader.close();
		
	}
	
}
