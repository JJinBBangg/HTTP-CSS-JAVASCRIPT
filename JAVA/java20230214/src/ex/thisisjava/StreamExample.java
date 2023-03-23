package ex.thisisjava;

import java.io.*;

public class StreamExample {
	public static void main(String[] args) {
		String filePath = "src/ex/thisisjava/StreamExample.java";
		try (var fr = new FileReader(filePath);
				var br = new BufferedReader(fr)) {
			int rowNumber = 0;
			String rowData = "";
			while ((rowData = br.readLine()) != null) {
				System.out.println(rowNumber + "\t" + rowData);
				rowNumber++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
