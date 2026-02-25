import java.util.Scanner;
import java.util.ArrayList;



public class AddingAndDeleting
	{
	
	static Scanner userInput = new Scanner(System.in);

		public static void addingAndDeleting()
		{
			
			//Variables to recieve from the user before adding them to an object.
			
			String newFirstName;
			String newLastName;
			String newPeriodOne;
			String newPeriodOneGrade;
			String newPeriodTwo;
			String newPeriodTwoGrade;
			String newPeriodThree;
			String newPeriodThreeGrade;
			
			
			
			System.out.println("Would you like to add or delete a student?");
			System.out.println("(1) add\n(2) delete\n(3) leave");
			
			int choice= userInput.nextInt();
			if(choice==1)
			{
				//asks for student's data then adds data as a new object 
				
				System.out.println("First name:");
				newFirstName=userInput.nextLine();			
				System.out.println("Last name:");
				newLastName=userInput.nextLine();
				System.out.println("Period one:");
				newPeriodOne=userInput.nextLine();
				System.out.println("Period one grade:");
				newPeriodOneGrade=userInput.nextLine();
				System.out.println("Period two:");
				newPeriodTwo=userInput.nextLine();
				System.out.println("Period two grade:");
				newPeriodTwoGrade=userInput.nextLine();
				System.out.println("Period three:");
				newPeriodThree=userInput.nextLine();
				System.out.println("Period three grade:");
				newPeriodThreeGrade=userInput.nextLine();
				
			//code to add data to a created object, need ArrayList name and name of the class where it is kept
				//directory.add(new Student(newFirstName, newLastName, newPeriodOne, newPeriodOneGrade, newPeriodTwo, newPeriodTwoGrade, newPeriodThree, newPeriodThreeGrade));
			}
			else if(choice==2)
			{
				//prints out directory with numbers and lets the user pick and delete a student by using their number.
				System.out.println("Select the student you wish to delete.");
				//a for loop to print the students with their number, need ArrayList name and name of the class where it is kept
		//**** 		for(int i=0; i<directory.length(); i++)
				{
		//****		System.out.println("["+i+1+"]  "+directory.get(i).getFirstName()+","+directory.get(i).getLastName()+","+directory.get(i).getPeriodOne()+directory.get(i).getPeriodOneGrade()+","+directory.get(i).getPeriodTwo()+directory.get(i).getPeriodTwoGrade()+","+directory.get(i).getPeriodThree()+directory.get(i).getPeriodThreeGrade());
					
				}
			int selection = userInput.nextInt();
		//****	System.out.println("Are you sure you wish to delete "+directory.get(selection-1).getFirstName()+" "+directory.get(selection-1).getLastName()+"?");
			System.out.println("(1) yes\n(2) no");
			int doubleSelection = userInput.nextInt();
			
			if(doubleSelection==1)
			{
		//****   directory.delete(selection-1)
			}
			else
			{
				addingAndDeleting();
			}
				
			}
			else if(choice==3)
			{
				System.out.println("Back to the main menu");
			}
			else
			{
				//Just dummy proofing it a little bit.
				
				System.out.println("Try again");
				addingAndDeleting();
			}
			
		}
		
	}
