package Byte_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Copying_Data_From_One_File_To_Other_File 
{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println(" enter first file");
		String file1 = sc.next();
		System.out.println(" enter second file");
		String file2 = sc.next();


		try {
			FileInputStream fis=new FileInputStream(file1);

			FileOutputStream fos=new FileOutputStream(file2,true);

			int read = fis.read();

			while(read!=-1)
			{
				fos.write(read);
				read=fis.read();
			}
			System.out.println(" data copied ");
			fos.flush();
			fos.close();
			fis.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
