package character_stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Count_Number_Of_Programs_A_File {

	public static void main(String[] args) throws IOException{

		BufferedReader br=new BufferedReader(new FileReader("allprograms.txt"));
		System.out.println("--------");

		String line=br.readLine();
		int program=0;
		int count=0;

		while( (line)!=null )
		{
			if( count==0 && line.contains("class"))
			{
				program++;
				System.out.println(line);
			}
			count=count+CountOccurence(line,'{')-CountOccurence(line,'}');
			System.out.println(count);
			line=br.readLine();
		}

		System.out.println(" no of programs are : "+program);

	} 

private static int CountOccurence(String line, char c)
{
	char[] ch = line.toCharArray();
	int count=0;
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]==c)
		{
			count++;
		}
	}
	return count;
}


}
