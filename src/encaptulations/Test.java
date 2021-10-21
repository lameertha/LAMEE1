package encaptulations;

/**
 * Created by Jay Vaghani on 28-Sep-2019
 */
public class Test {

    public static void main(String[] args) {

        EncaptulationDemo ec = new EncaptulationDemo();

        ec.setId(123);
        ec.setName("Prime");

        System.out.println(ec.getId());
        System.out.println(ec.getName());
    }
}
