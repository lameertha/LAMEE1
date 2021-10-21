package collection;

import java.util.ArrayList;

/**
 * Created by Jay Vaghani on 21-Sep-2019
 */
public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> carList = new ArrayList<>();

        //Adding
        carList.add("BMW");
        carList.add("Honda");
        carList.add("Audi");
        carList.add("Ford");

        //Size
        int size = carList.size();
        System.out.println(size);

        //Get
        System.out.println(carList.get(1));

        // Iteration
        System.out.println("Iteration Example");
        for (int i = 0; i < size; i++) {
            System.out.println("Item on index " + i + " is: " + carList.get(i));
        }

        System.out.println("\nNext for loop example");
        for (String car: carList) {
            System.out.println("The item is "+car);
        }

        // remove
        carList.remove(size-1);
        System.out.println("\nNext for loop example after removing");
        for (String car: carList) {
            System.out.println("The item is "+car);
        }

    }



}
