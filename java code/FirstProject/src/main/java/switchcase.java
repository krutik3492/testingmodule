//switch case
import java.util.Scanner;

public class switchcase {
	public static void main(String[] args) {
		
		int day = 7;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("Day " + day + " is " + dayName);
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        
        int day1=sc.nextInt();
        
        String dayName1;

        switch (day1) {
            case 1:
                dayName1 = "Sunday";
                break;
            case 2:
                dayName1 = "Monday";
                break;
            case 3:
                dayName1= "Tuesday";
                break;
            case 4:
                dayName1 = "Wednesday";
                break;
            case 5:
                dayName1 = "Thursday";
                break;
            case 6:
                dayName1 = "Friday";
                break;
            case 7:
                dayName1 = "Saturday";
                break;
            default:
                dayName1 = "Invalid day";
                break;
        }

        System.out.println("Day " + day1 + " is " + dayName1);

        
    }
	
}
//In this example, if day is 3, the output will be: "Day 3 is Tuesday". If day is any other value, it will display: "Invalid












