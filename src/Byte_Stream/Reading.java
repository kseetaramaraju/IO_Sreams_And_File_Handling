package Byte_Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Reading {
	public static void main(String[] args) {

		//C:\Users\seetharamaraju\OneDrive\Desktop\Bridge Labz\IO_Streams_And_File_Handling
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\seetharamaraju\\OneDrive\\Desktop\\Bridge Labz\\IO_Streams_And_File_Handling\\a.txt");

			int read = fis.read();
			while(read!=-1)
			{
				System.out.print((char)read);
				read=fis.read();
			}

			//			byte b[]=new byte[32];
			//
			//			int read = fis.read(b);
			//			while(read!=-1)
			//			{
			//				System.out.print((char)read);
			//				read=fis.read();
			//			}


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	//	private static File createFile() 
	//	{
	//		File f=new File("a.txt");
	//		boolean b;
	//		try {
	//			b=f.createNewFile();
	//			if(b)
	//			{
	//				System.out.println(" File Is Created ");
	//			}
	//			else
	//			{
	//				System.out.println(" File is Not Created ");
	//			}
	//		} catch (IOException e) {
	//			// TODO Auto-generated catch block
	//			e.printStackTrace();
	//		}
	//		return f;
	//	}

}
