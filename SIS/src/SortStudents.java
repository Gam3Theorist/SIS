import java.util.Collections;
import java.util.ArrayList;

public class SortStudents
	{
		// Sort by GPA, sort by last name, sort by period
		public static void sortByGPA()
		{
			System.out.println("The students listed by GPA are:");
		}
		
		public static void sortByLastName()
		{
			ArrayList<Student> organizedNames = new ArrayList<Student>();
			organizedNames = TextFile.directory;
			System.out.println("The students listed by last name are:");
			
			
			
			
			String tempFirstName;
			for (Student n: organizedNames)
				{
					tempFirstName = n.getFirstName();
					n.setFirstName(n.getLastName());
					n.setLastName(tempFirstName);
				}
			// We need to sort first, then print out sorted names
			// Collections.sort(TextFile.directory, Student.lastName);
			// Collections.sort(organizedNames); HOW DOES THIS WORK?
			
			
			
			
			
			
			System.out.println("Name               Period 1   P1 Grade   Period 2   P2 Grade   Period 3   P3 Grade     GPA");
			for (Student s: organizedNames)
				{
					System.out.printf("%-18s %-12s %-8s %-12s %-8s %-12s %-10s %-4s%n", s.getFirstName() + " " + s.getLastName(), s.getFirstPeriod(), s.getFirstGrade(), 
							s.getSecondPeriod(), s.getSecondGrade(), s.getThirdPeriod(), s.getThirdGrade(), s.getGpa());
				}
			
		}
		public static void sortByPeriod()
		{
			System.out.println("The students listed by period are:");
			// alphebatize by period name; within each period, sort by alphebatized last name
		}
	}
