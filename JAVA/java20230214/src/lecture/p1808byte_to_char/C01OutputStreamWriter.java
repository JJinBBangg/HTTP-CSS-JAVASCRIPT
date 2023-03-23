package lecture.p1808byte_to_char;

import java.io.*;

public class C01OutputStreamWriter {
	public static void main(String[] args) throws IOException {
		String fileName = "output/byte1.txt";
		OutputStream os = getOutput(fileName);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		
		os.write('a');
		os.write('b');
		osw.write('찐');
		osw.write('빵');
		
		osw.close();
	}
	
	public static OutputStream getOutput(String fileName) throws FileNotFoundException {
		FileOutputStream os = new FileOutputStream(fileName);
		
		return os;
	}
}
