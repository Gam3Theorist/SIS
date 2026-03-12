import java.util.Comparator;

public class GPASorter implements Comparator<Student>
	{
		
		public int compare(Student s1, Student s2)
			{
			Double gpa1 = Double.parseDouble(s1.getGpa());
			Double gpa2 = Double.parseDouble(s2.getGpa());
		
			if (gpa1.compareTo(gpa2) == -1)
			{
			return 1;
			}
			else if (gpa1.compareTo(gpa2) == 1)
			{
			return -1;
			}
			return 1;
			
	}
}