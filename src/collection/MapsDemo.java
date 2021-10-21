package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jay Vaghani on 21-Sep-2019
 */
public class MapsDemo {
    public static void main(String[] args) {

        // Store in pair, key -> value :Entry

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "BMW");
        map.put(6, "Audi");
        map.put(4, "Honda");

        String  value1 = map.get(1);
        System.out.println(value1);

        //Keys are unique, value can be duplicated
        map.put(2, "BMW");
        map.put(4, "Merc");

        String value2 = map.get(4);
        System.out.println(value2);

        String value3 = map.get(2);
        System.out.println();
    }
}
