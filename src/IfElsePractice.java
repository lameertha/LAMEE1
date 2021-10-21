/**
 * Created by Jay Vaghani on 07-Sep-2019
 */
public class IfElsePractice {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        if (a<c) {
            System.out.println("True");
            if (b<c){
                System.out.println("B is less than C");
            }else {
                System.out.println("False");
              }
        }else{
            System.out.println("false1");
        }
        System.out.println("Default");

    }

}
