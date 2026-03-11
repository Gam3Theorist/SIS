
public class gpaCalculator
	{
		public static double gpa=0.00;
		public static String tempGrade = "A";
		
		
		public static void gpaCalculator()
		{

for(int i=0; i<TextFile.directory.size();i++) 
{
	tempGrade=(TextFile.directory.get(i).getFirstGrade());
	letterToGradeConverter();
	tempGrade=(TextFile.directory.get(i).getSecondGrade());
	letterToGradeConverter();
	tempGrade=(TextFile.directory.get(i).getThirdGrade());
	letterToGradeConverter();
	
	gpa= gpa/3;
	TextFile.directory.get(i).setGpa(gpa);
	gpa=0.00;
}




		}
		

		public static void letterToGradeConverter()
		{
			
			
			if(tempGrade.equals("A+"))
				{
					gpa+=4.30;
				}
			else if(tempGrade.equals("A"))
			{
				gpa+=4.00;
			}
			else if(tempGrade.equals("A-"))
			{
				gpa+=3.70;
			}
			else if(tempGrade.equals("B+"))
			{
				gpa+=3.30;
			}
			else if(tempGrade.equals("B"))
			{
				gpa+=3.00;
			}
			else if(tempGrade.equals("B-"))
			{
				gpa+=2.70;
			}
			else if(tempGrade.equals("C+"))
			{
				gpa+=2.30;
			}
			else if(tempGrade.equals("C"))
			{
				gpa+=2.00;
			}
			else if(tempGrade.equals("C-"))
			{
				gpa+=1.70;
			}
			else if(tempGrade.equals("D+"))
			{
				gpa+=1.30;
			}
			else if(tempGrade.equals("D"))
			{
				gpa+=1.00;
			}
			else if(tempGrade.equals("D-"))
			{
				gpa+=0.70;
			}
			else if(tempGrade.equals("F+"))
			{
				gpa+=0.30;
			}
			else if(tempGrade.equals("F"))
			{
				gpa+=0.00;
			}
			else if(tempGrade.equals("F-"))
			{
				gpa+=0.00;
			}
			
	
			
				
		}
		
		
	}
