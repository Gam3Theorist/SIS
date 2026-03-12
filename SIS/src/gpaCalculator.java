import java.math.RoundingMode;
import java.math.BigDecimal;

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
	
	// raw GPA as a double
	gpa = gpa/3;
	
	// raw GPA as a BigDecimal
	BigDecimal rawGPA = new BigDecimal(gpa);
	
	// raw GPA rounded to accepted value
	BigDecimal trueGPA = rawGPA.setScale(2, RoundingMode.HALF_UP);
	
	// BigDecimal trueGPA set to double gpa
	gpa = trueGPA.doubleValue();
	
	// The next line formats gpa such that it always has one digit before the decimal and two afterwards
	String wordGPA = String.format("%.2f", gpa);
	//gpa = Double.parseDouble(wordGPA);
	
	
	// Final gpa value assigned to student
	TextFile.directory.get(i).setGpa(wordGPA);
	
	// gpa value reset for next student
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
