package polymorphism.constructoroverloading;

/**
 * Created by Jay Vaghani on 21-Sep-2019
 */
public class Ford {
    int speed;
    String name;
    boolean type;

    public Ford() {

    }

    public Ford(int speed,int b) {
        this.speed = speed;
    }

    public Ford(String name, boolean type) {
        this.name = name;
        this.type = type;
    }

    public Ford(int speed, String name, boolean type) {
        this.speed = speed;
        this.name = name;
        this.type = type;
    }
}
