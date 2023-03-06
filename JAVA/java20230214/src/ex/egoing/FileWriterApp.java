package ex.egoing;

import java.io.*;
import java.util.*;

public class FileWriterApp {
	public static void main(String[] args) throws IOException {
		Writer fileWriter = new FileWriter("filewriter.txt");
		fileWriter.write("data 1");
		fileWriter.write("data 2");
		fileWriter.write("data 3");

		fileWriter.close();
		
		ArrayList<String> a = new ArrayList<>();
		a.clear();
		a.add(0, null);
	}
}