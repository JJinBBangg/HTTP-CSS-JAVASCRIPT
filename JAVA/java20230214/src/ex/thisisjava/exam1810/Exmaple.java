package ex.thisisjava.exam1810;

import java.io.*;
import java.util.*;

public class Exmaple {
	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		System.out.print(" Directory 이름을 입력하세요>");
//		String dirName = sc.nextLine();
//		System.out.print("원본 File 이름을 입력하세요>");
//		String fileName = sc.nextLine();
//		System.out.print("복사할 File이름을 입력하세요>");
//		String fileNameCopy = sc.nextLine();
//
//		File dir = new File("output/" + dirName);
//		if (dir.exists() == false) {
//			System.out.println(dirName + "디렉토리가 존재하지않습니다. 새로운" + dirName + "디렉토리를 생성합니다");
//			dir.mkdirs();
//		}
//		File file1 = new File("output/"+dirName+"/" + fileName);
//		File file2 = new File("output/"+dirName+"/" + fileNameCopy);
//		if (file1.exists() == false) {
//			System.out.println(fileName +"파일이 존재하지않습니다. 새로운" + fileName + "파일을를 생성합니다");
//			file1.createNewFile();
//		}
//		System.out.println("복사를 시작합니다.");		
//		if (file2.exists() == false) {
//			file2.createNewFile();
//		}
//		var fos =new BufferedOutputStream(new FileOutputStream("output/"+dirName+"/"+ fileName));
//		var fis =new BufferedInputStream(new FileInputStream("output/"+dirName+"/" + fileNameCopy));
//		int len ;
//		while((len = fis.read()) !=-1) {
//			fos.write(1);
//		}
//		fis.close();
//		fos.close();
//		
		// 파일명 입력 받는 코드(option)
//		String origin = "output/slamdunk.jpg";
//		String copy = "output/slamdunk_copy10.jpg";
		String origin = "";
		String copy = "";

		// 복사하는 코드 작성
		try (
				InputStream is = new FileInputStream(origin);
				BufferedInputStream bis = new BufferedInputStream(System.in);
				InputStreamReader isr = new InputStreamReader(bis);) {

			char[] inputFileCharArray = new char[1024];
			System.out.print("원본 파일 경로:");
			int len = isr.read(inputFileCharArray);

			origin = new String(inputFileCharArray, 0, len);
			origin = origin.strip();

			System.out.print("복사할 파일 경로:");
			len = isr.read(inputFileCharArray);

			copy = new String(inputFileCharArray, 0, len);
			copy = copy.strip();

//			System.out.println(origin);
//			System.out.println(copy);

			File file = new File(origin);
			if (!file.exists()) {
				System.out.println("원본 파일이 존재하지 않습니다.");
				return;
			}

			int lastSlashIndex = copy.lastIndexOf("/");
			String copyFolder = copy.substring(0, lastSlashIndex);
			File file2 = new File(copyFolder);
			if (!file2.exists()) {
				file2.mkdirs();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// 복사하는 코드 작성
		try (InputStream is = new FileInputStream(origin);
				OutputStream os = new FileOutputStream(copy);

				BufferedInputStream bis = new BufferedInputStream(is);
				BufferedOutputStream bos = new BufferedOutputStream(os);) {
			byte[] data = new byte[1024];
			int len = 0;
			while ((len = bis.read(data)) != -1) {
				bos.write(data, 0, len);
			}

			bos.flush();

			System.out.println("복사가 성공되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
