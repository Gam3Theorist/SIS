import java.util.Collections;
import java.util.Scanner;

public class SortStudents
	{
		// Sort by GPA, sort by last name, sort by period
		static Scanner userPeriodInput = new Scanner(System.in);
		static int periodToOrganize;
		
		public static void sortByGPA()
		{
			Collections.sort(TextFile.directory, new GPASorter());
			System.out.println("The students listed by GPA are:");
			System.out.println("Name               Period 1   P1 Grade   Period 2   P2 Grade   Period 3   P3 Grade     GPA");
			for (Student s: TextFile.directory)
				{
					System.out.printf("%-18s %-12s %-8s %-12s %-8s %-12s %-10s %-4s%n", s.getFirstName() + " " + s.getLastName(), s.getFirstPeriod(), s.getFirstGrade(), 
							s.getSecondPeriod(), s.getSecondGrade(), s.getThirdPeriod(), s.getThirdGrade(), s.getGpa());
				}
		}
		public static void sortByLastName()
		{
			
			Collections.sort(TextFile.directory, new NameSorter());
			
			System.out.println("The students listed by last name are:");
			System.out.println("Name               Period 1   P1 Grade   Period 2   P2 Grade   Period 3   P3 Grade     GPA");
			for (Student s: TextFile.directory)
				{
					System.out.printf("%-18s %-12s %-8s %-12s %-8s %-12s %-10s %-4s%n", s.getFirstName() + " " + s.getLastName(), s.getFirstPeriod(), s.getFirstGrade(), 
							s.getSecondPeriod(), s.getSecondGrade(), s.getThirdPeriod(), s.getThirdGrade(), s.getGpa());
				}
			
			// We need to sort first, then print out sorted names
			// Collections.sort(TextFile.directory, Student.lastName);
				
		}
		public static void sortByPeriod()
		{
			System.out.println("Which period would you like to sort by? (1) First Period (2) Second Period (3) Third Period");
			periodToOrganize = userPeriodInput.nextInt();
			
			Collections.sort(TextFile.directory, new PeriodSorter());
			
			{
				System.out.println("The students listed by period are:");
				System.out.println("Name               Period 1   P1 Grade   Period 2   P2 Grade   Period 3   P3 Grade     GPA");
				for (Student s: TextFile.directory)
					{
						System.out.printf("%-18s %-12s %-8s %-12s %-8s %-12s %-10s %-4s%n", s.getFirstName() + " " + s.getLastName(), s.getFirstPeriod(), s.getFirstGrade(), 
								s.getSecondPeriod(), s.getSecondGrade(), s.getThirdPeriod(), s.getThirdGrade(), s.getGpa());
					}
			}
			// alphabetize by period name; within each period, sort by alphabetized last name
		}
	}
