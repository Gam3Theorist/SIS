import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TextFile 
	{
		public static void textFile() throws IOException
		{
			Scanner studentList = new Scanner(new File("StudentList.txt"));
			
			ArrayList<Student> directory = new ArrayList<Student>();
			
			while (studentList.hasNext())
				{
					String line = studentList.nextLine();
					String[] data = line.split(" ");

					
				}
		}
}