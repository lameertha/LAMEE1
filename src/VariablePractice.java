/**
 * Created by Jay Vaghani on 03-Aug-2019
 */
public class VariablePractice {

    int a = 10;
    int b = 20;
    static int c = 30;
    static String name = "Prime Testing";

    public static void main(String[] args) {
        System.out.println("Starting");
        System.out.println("Ending");
        VariablePractice vp = new VariablePractice();
        vp.add();
        sub();

    }

    public static void sub() {
        System.out.println(c);
    }

    public void add() {
        System.out.println(VariablePractice.name);
        System.out.println("Testing");
        System.out.println(b);
        System.out.println("Prime");

    }

}
