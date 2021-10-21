import java.util.Scanner;

/**
 * Created by Jay Vaghani on 07-Sep-2019
 */
public class DayOFTheWeek {

    public static void main(String[] args) {
        System.out.println("Please Enter Number of Days :");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        if (day==1){
            System.out.println("First day of week is Monday");
        }else if (day==2){
            System.out.println("Second day of week is Tuesday");
        }else if(day == 3){
            System.out.println("Wednesday");
        }else if (day == 4){
            System.out.println("Thursday");
        }else if (day == 5){
            System.out.println("Friday");
        }else if(day == 6){
            System.out.println("Saturday");
        }else if (day == 7){
            System.out.println("Sunday");
        }else {
            System.out.println("Week has only 7 days");
        }
    }
}
