package WithOut_Using_BufferReaderOrWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writing {
	public static void main(String[] args) {

		File f=new File("c.txt");
		FileWriter fw;
		try {
			fw=new FileWriter(f,true);
			fw.write("Hello Hii Every One How are You \n Nice To Meet You ");
			fw.flush();

			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}




	}

}
