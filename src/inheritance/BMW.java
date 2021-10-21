package inheritance;

/**
 * Created by Jay Vaghani on 21-Sep-2019
 */
public class BMW extends Cars{

    public BMW(int speed) {
        super(speed);
    }

    public void headUpDisplayNavigation() {
        System.out.println("BMW Specific Functionality");
    }




}
