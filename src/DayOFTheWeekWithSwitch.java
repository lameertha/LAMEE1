import java.util.Scanner;

/**
 * Created by Jay Vaghani on 07-Sep-2019
 */
public class DayOFTheWeekWithSwitch {

    public static void main(String[] args) {
        System.out.println("Please Enter Number of Days :");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.next();
        switch (day.toLowerCase()) {
            case "monday":
                System.out.println("First day of week is Monday");
                break;
            case "tuesday":
                System.out.println("Second day of week is Tuesday");
                break;
            case "Wednesday":
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Week has only 7 days");

        }
    }
}
