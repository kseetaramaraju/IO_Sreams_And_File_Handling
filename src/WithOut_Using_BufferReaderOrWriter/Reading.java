package WithOut_Using_BufferReaderOrWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reading {
	public static void main(String[] args) {

		File f=new File("c.txt");
		FileReader fr;
		try {
			fr=new FileReader(f);
			int read = fr.read();

			while(read!=-1)
			{
				System.out.print((char)read);
				read=fr.read();
			}
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
