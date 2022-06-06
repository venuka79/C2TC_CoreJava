import java.util.Scanner;
public class DaysInAGivenMonth
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int Days=0;
		String MonthName="Invalid";
		
		System.out.println("Enter the month number:  ");
		int month= sc.nextInt();
		 
		System.out.println("Enter the Year: ");
        int year = sc.nextInt();

		switch(month)
		{
		case 1:
            MonthName = "January";
            Days = 31;
            break;
        case 2:
            MonthName = "February";
            if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) {
                Days = 29;
                break;
            } else {
                Days = 28;
                break;
            }
        case 3:
            MonthName = "March";
            Days = 31;
            break;
        case 4:
            MonthName = "April";
            Days = 30;
            break;
        case 5:
            MonthName = "May";
            Days = 31;
            break;
        case 6:
            MonthName = "June";
            Days = 30;
            break;
        case 7:
            MonthName = "July";
            Days = 31;
            break;
        case 8:
            MonthName = "August";
            Days = 31;
            break;
        case 9:
            MonthName = "September";
            Days = 30;
            break;
        case 10:
            MonthName = "October";
            Days = 31;
            break;
        case 11:
            MonthName = "November";
            Days = 30;
            break;
        case 12:
            MonthName = "December";
            Days = 31;
            break;
    }
    System.out.println(MonthName+"  "+Days
    		+" days\n");
}

}