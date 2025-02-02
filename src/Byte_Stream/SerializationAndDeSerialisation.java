package Byte_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationAndDeSerialisation {
	public static void main(String[] args) {

		Student s=new Student(10,"ram");
		try {
			// serialization
			FileOutputStream fos=new FileOutputStream("s.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s);
			oos.flush();
			System.out.println(" data entered ");

			// de-serialisation
			FileInputStream fis=new FileInputStream("s.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Student ss=(Student)ois.readObject();
			System.out.println(ss);

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
