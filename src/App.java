import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Create scanner object
        Scanner input= new Scanner(System.in);

        //Collect user input
        System.out.print("Please enter the month as an integer: ");
        int month = input.nextInt();
        System.out.print("Please enter the year as an integer: ");
        int year = input.nextInt();

         //Check if inputted year is a leap year
         boolean leapYear = (year % 4 == 0 && year % 100 != 0)||(year % 400== 0);

        //Display number of days in the month
        switch (month) {
            case 1: System.out.print("January " + year + " had 31 days.");
            break;
            case 2: System.out.print("February " + year + " had " + ((leapYear)? "29 days" : "28 days"));
            break;
            case 3: System.out.print("March " + year + " had 31 days.");
            break;
            case 4: System.out.print("April " + year + " had 30 days.");
            break;
            case 5: System.out.print("May " + year + " had 31 days.");
            break;
            case 6: System.out.print("June " + year + " had 30 days.");
            break;
            case 7: System.out.print("July " + year + " had 31 days.");
            break;
            case 8: System.out.print("August " + year + " had 31 days.");
            break;
            case 9: System.out.print("September " + year + " had 30 days.");
            break;
            case 10: System.out.print("October " + year + " had 31 days.");
            break;
            case 11: System.out.print("November " + year + " had 30 days.");
            break;
            case 12: System.out.print("December " + year + " had 31 days.");
        }

    }
}
