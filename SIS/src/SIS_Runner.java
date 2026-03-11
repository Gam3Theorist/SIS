import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SIS_Runner
	{
	
	static int selection;
	static int changeSelection;
	static Scanner masterInput = new Scanner(System.in);

		public static void main(String[] args)  throws IOException
			{
			// System.out.println(new java.io.File("StudentList.txt").getAbsolutePath());
			// Don't delete the following lines; they are necessary for us to use the textFile() method
				try 
				{
					TextFile.textFile();
				}
				catch (IOException exc)
				{
					System.out.println("An I/O error occurred: " + exc.getMessage());
				}
				
				gpaCalculator.gpaCalculator();
				SortStudents.sortByGPA();
				System.out.println("Welcome to the Student Information System");
			
				
				System.out.println("What would you like to do?");
				System.out.println("1) add or delete a student");
				System.out.println("2) change student grades/schedule");
				System.out.println("3) sort students");
						
				
				selection = masterInput.nextInt();
				if (selection == 1)
				{
					AddingAndDeleting.addingAndDeleting();
				}
				else if (selection == 2)
				{
					System.out.println("Would you like to (1) Change a student's grade or (2) Change a student's schedule?");
					changeSelection = masterInput.nextInt();
					if (changeSelection == 1)
					{
						ChangeVariables.changeVariable();
					}
					else if (changeSelection == 2)
					{
						ChangeVariables.changeClass();
					}
					
				}
				else if (selection == 3)
				{
					int sortSelection;
					System.out.println("What would you like to do?");
					System.out.println("(1) Sort students by GPA");
					System.out.println("(2) Sort students by last name");
					System.out.println("(3) Sort students by period.");
					sortSelection = masterInput.nextInt();
					if (sortSelection == 1)
						{
							SortStudents.sortByGPA();
						}
					else if (sortSelection == 2)
						{
							SortStudents.sortByLastName();
						}
					else if (sortSelection == 3)
						{
							SortStudents.sortByPeriod();
						}
					
				}
				
			}

	}
