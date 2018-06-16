package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteOperation {

	public static void main(String[] args) throws IOException {
		
		
		try {
			/*FileOutputStream fos = new FileOutputStream("F:\\subject\\selenium\\sample programs\\Harika\\testfile.txt");
			String s = "Selenium WebDriver examples";
			byte[] b = s.getBytes();
			fos.write(b);
			fos.close();*/
			FileWriter fw = new FileWriter("F:\\subject\\selenium\\sample programs\\Harika\\testfile.txt");
			String s = "Java Program examples";
			fw.write(s);
			fw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
