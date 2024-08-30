package Byte_Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writing {
	public static void main(String[] args) {

		byte b[]= {'H','E','L','L','O'};
		byte a[]= {'E','V','E','R','Y','O','N','E'};


		try {
			FileOutputStream fos=new FileOutputStream("a.txt",true);
			fos.write(65);

			fos.write(b);
			fos.write(a,0,5);

			fos.write(a,0,8);

			System.out.println(" Data Entered ");

			fos.flush();
			fos.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
