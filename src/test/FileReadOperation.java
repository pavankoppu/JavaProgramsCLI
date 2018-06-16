package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadOperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	FileReader fin = new FileReader("F:\\subject\\selenium\\sample programs\\Harika\\testfile.txt");
	int i =0;
	while((i = fin.read())!= -1)
	{
		char ch = (char)(i);
		System.out.println(ch);
	}
	fin.close();
	
	}

}
