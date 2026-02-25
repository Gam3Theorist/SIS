
public class Student
	{
		private String firstName;
		private String lastName;
		private String firstPeriod;
		private String firstGrade;
		private String secondPeriod;
		private String secondGrade;
		private String thirdPeriod;
		private String thirdGrade;
		private double gpa;
		private int periodOneNumber;
		private int periodTwoNumber;
		private int periodThreeNumber;
			

			public Student (String fN, String lN, String fP, String fG, String sP, String sG, String tP, String tG, double g, int pON, int pTN, int pThN)
			{
				firstName = fN;
				lastName = lN;
				firstPeriod = fP;
				firstGrade = fG;
				secondPeriod = sP;
				secondGrade = sG;
				thirdPeriod = tP;
				thirdGrade = tG;
				gpa = g;
				periodOneNumber = pON;
				periodTwoNumber = pTN;
				periodThreeNumber = pThN;
				}
			
			public String getFirstName()
				{
					return firstName;
				}

			public void setFirstName(String firstName)
				{
					this.firstName = firstName;
				}

			public String getLastName()
				{
					return lastName;
				}

			public void setLastName(String lastName)
				{
					this.lastName = lastName;
				}

			public String getFirstPeriod()
				{
					return firstPeriod;
				}

			public void setFirstPeriod(String firstPeriod)
				{
					this.firstPeriod = firstPeriod;
				}

			public String getFirstGrade()
				{
					return firstGrade;
				}

			public void setFirstGrade(String firstGrade)
				{
					this.firstGrade = firstGrade;
				}

			public String getSecondPeriod()
				{
					return secondPeriod;
				}

			public void setSecondPeriod(String secondPeriod)
				{
					this.secondPeriod = secondPeriod;
				}

			public String getSecondGrade()
				{
					return secondGrade;
				}

			public void setSecondGrade(String secondGrade)
				{
					this.secondGrade = secondGrade;
				}

			public String getThirdPeriod()
				{
					return thirdPeriod;
				}

			public void setThirdPeriod(String thirdPeriod)
				{
					this.thirdPeriod = thirdPeriod;
				}

			public String getThirdGrade()
				{
					return thirdGrade;
				}

			public void setThirdGrade(String thirdGrade)
				{
					this.thirdGrade = thirdGrade;
				}

			public double getGpa()
				{
					return gpa;
				}

			public void setGpa(double gpa)
				{
					this.gpa = gpa;
				}

			public int getPeriodOneNumber()
				{
					return periodOneNumber;
				}

			public void setPeriodOneNumber(int periodOneNumber)
				{
					this.periodOneNumber = periodOneNumber;
				}

			public int getPeriodTwoNumber()
				{
					return periodTwoNumber;
				}

			public void setPeriodTwoNumber(int periodTwoNumber)
				{
					this.periodTwoNumber = periodTwoNumber;
				}

			public int getPeriodThreeNumber()
				{
					return periodThreeNumber;
				}

			public void setPeriodThreeNumber(int periodThreeNumber)
				{
					this.periodThreeNumber = periodThreeNumber;
				}
			}
	