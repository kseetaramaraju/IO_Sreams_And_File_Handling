package character_stream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writing {
	public static void main(String[] args) {
		File f=new File("abc.txt");
		FileWriter fw;
		try {
			fw = new FileWriter(f);
			BufferedWriter bw=new BufferedWriter(fw);

			bw.write(65);
			bw.newLine();
			char [] ch= {'H','E','L','L','O'};
			bw.write(ch);
			bw.newLine();

			bw.write(" EveryOne ");
			bw.newLine();

			bw.flush();
			System.out.println(" Data Is Stored ");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
