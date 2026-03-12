import java.util.Scanner;
import java.util.ArrayList;



public class AddingAndDeleting
	{
	
	static Scanner userInput = new Scanner(System.in);

		public static void addingAndDeleting()
		{

			
			
			
			String newFirstName;
			String newLastName;
			String newFirstPeriod;
			String newFirstGrade;
			String newSecondPeriod;
			String newSecondGrade;
			String newThirdPeriod;
			String newThirdGrade;
			
			
			
			System.out.println("Would you like to add or delete a student?");
			System.out.println("(1) add\n(2) delete");
			
			int choice= userInput.nextInt();
			if(choice==1)
			{
				//asks for student's data then adds data as a new object 
				
				String stupidLittleIdiotPlaceholderBecauseForSomeReasonItDoesntTakeTheFirstInputAndIDontKnowWhySoInsteadOfFixingItIJustAddedThisWeirdOneSoThatTheNormalOnesAllCountAndThisWeirdOneDoesntANDITWORKSIGUESSSOTHATSCOOL=userInput.nextLine();
				
				System.out.println("First name:");
				newFirstName=userInput.nextLine();							
				System.out.println("Last name:");
				newLastName=userInput.nextLine();
				System.out.println("Period one:");
				newFirstPeriod=userInput.nextLine();
				System.out.println("Period one grade:");
				newFirstGrade=userInput.nextLine();
				System.out.println("Period two:");
				newSecondPeriod=userInput.nextLine();
				System.out.println("Period two grade:");
				newSecondGrade=userInput.nextLine();
				System.out.println("Period three:");
				newThirdPeriod=userInput.nextLine();
				System.out.println("Period three grade:");
				newThirdGrade=userInput.nextLine();
				

			//code to add data to a created object
				TextFile.directory.add(new Student(newFirstName, newLastName, newFirstPeriod, newFirstGrade, newSecondPeriod, newSecondGrade, newThirdPeriod, newThirdGrade, "0.0", 0, 0, 0));
				PrintDirectory.printDirectory();
				
				
				//loop
				SIS_Runner.runsTheWholeProgram();
			}
			
	//---------------------------------------------------------------------		
	//code for deleting a student 
			
			else if(choice==2)
			{
//need code that prints out TextFile.directory with numbers and lets the user pick and delete a student by using their number.
				System.out.println("Select the student you wish to delete.\n");
				
				System.out.println("    Name               Period 1   P1 Grade   Period 2   P2 Grade   Period 3   P3 Grade     GPA");
				
				for (int i=0; i<TextFile.directory.size();i++)
					{
					System.out.print("["+(i+1)+"]");
						System.out.printf("%-18s %-12s %-8s %-12s %-8s %-12s %-10s %-4s%n", TextFile.directory.get(i).getFirstName() + " " + TextFile.directory.get(i).getLastName(), TextFile.directory.get(i).getFirstPeriod(), TextFile.directory.get(i).getFirstGrade(), 
								TextFile.directory.get(i).getSecondPeriod(), TextFile.directory.get(i).getSecondGrade(), TextFile.directory.get(i).getThirdPeriod(), TextFile.directory.get(i).getThirdGrade(), TextFile.directory.get(i).getGpa());
					}
				
			
			int selection = userInput.nextInt();
	System.out.println("Are you sure you wish to delete "+TextFile.directory.get(selection-1).getFirstName()+" "+TextFile.directory.get(selection-1).getLastName()+"?");
			System.out.println("(1) yes\n(2) no");
			int doubleSelection = userInput.nextInt();
			
			if(doubleSelection==1)
			{
		   TextFile.directory.remove(selection-1);
		   PrintDirectory.printDirectory();
			
			
//loop
SIS_Runner.runsTheWholeProgram();
			}
			else
			{
				addingAndDeleting();
			}
				
			}
	
			
		}
		
	}
