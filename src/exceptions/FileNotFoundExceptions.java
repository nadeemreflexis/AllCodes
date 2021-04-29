package exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExceptions {

	public static void main(String[] args) throws IOException 
	{
		File file = new File("E:\\abc.txt");
		FileReader fr = new FileReader(file);
		char[]  a = new char[200]; 
		fr.read(a);
		System.out.println(a.length);
		for(int c =0;c<a.length;c++)
		{
			System.out.print(a[c]);
		}
	/*	for(char c: a)
		{
			System.out.print(c);
		} */
		fr.close();

	}

}
