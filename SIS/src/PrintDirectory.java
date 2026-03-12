


public class PrintDirectory
	{
	
		public static void printDirectory()
		{
			
			gpaCalculator.gpaCalculator();
			
			//lol stole from Caden's code, but you can use this as a print to be quick and concise <3   
			
			System.out.println("Name               Period 1   P1 Grade   Period 2   P2 Grade   Period 3   P3 Grade     GPA");
			for (Student s: TextFile.directory)
				{
					System.out.printf("%-18s %-12s %-8s %-12s %-8s %-12s %-10s %-4s%n", s.getFirstName() + " " + s.getLastName(), s.getFirstPeriod(), s.getFirstGrade(), 
							s.getSecondPeriod(), s.getSecondGrade(), s.getThirdPeriod(), s.getThirdGrade(), s.getGpa());
				}

		}
	

	}
