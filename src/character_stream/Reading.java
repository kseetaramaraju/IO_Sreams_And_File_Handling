package character_stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reading
{
	public static void main(String[] args)
	{
		File f=new File("abc.txt");

		try {
			FileReader fr=new FileReader(f);
			BufferedReader br=new  BufferedReader(fr);

			// first way 
			//			int data;
			//			while((data=br.read())!=-1)
			//			{
			//				System.out.print((char)data);
			//			}

			// second way 

			String s=br.readLine();
			while(s!=null)
			{
				System.out.println(s);
				s=br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
