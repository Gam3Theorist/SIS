import java.util.Comparator;

public class GPASorter implements Comparator<Student>
	{
		
		public int compare(Student s1, Student s2)
			{
			String gpa1;
			String gpa2;
			gpa1 = s1.toString();
			gpa2 = s2.toString();
						
			return gpa1.compareTo(gpa2);
			}

	}
