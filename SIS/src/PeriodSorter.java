import java.util.Comparator;
// this method implements the "chained" approach for comparators 
public class PeriodSorter implements Comparator<Student>
	{
		public int compare(Student s1, Student s2)
			{
			if (SortStudents.periodToOrganize == 1)
			{	
				if (s1.getFirstPeriod().compareTo(s2.getFirstPeriod()) != 0)
				{
					return s1.getFirstPeriod().compareTo(s2.getFirstPeriod());
				}
				else
				{
					return s1.getLastName().compareTo(s2.getLastName());
				}
			}
		else if (SortStudents.periodToOrganize == 2)
			{
				if (s1.getSecondPeriod().compareTo(s2.getSecondPeriod()) != 0)
				{
					return s1.getSecondPeriod().compareTo(s2.getSecondPeriod());
				}
				else
				{
					return s1.getLastName().compareTo(s2.getLastName());
				}
			}
		else if (SortStudents.periodToOrganize == 3)
			{
				if (s1.getThirdPeriod().compareTo(s2.getThirdPeriod()) != 0)
				{
					return s1.getThirdPeriod().compareTo(s2.getThirdPeriod());
				}
				else
				{
					return s1.getLastName().compareTo(s2.getLastName());
				}
				
			}
			
		return s1.getFirstPeriod().compareTo(s2.getFirstPeriod());
			}
	}