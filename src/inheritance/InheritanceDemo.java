package inheritance;


public class InheritanceDemo extends BMW {

    public InheritanceDemo(int speed) {
        super(speed);
    }

    public void increaseSpeedInInheritanceDemo() {
        System.out.println("Increasing Speed of Cars of InheritanceDemo");
    }

    public static void main(String[] args) {

      //  int speed = 10;
        // child class object
        InheritanceDemo obj = new InheritanceDemo(10);
        obj.increaseSpeedInInheritanceDemo();//child class method
        obj.headUpDisplayNavigation();// BMW class method
        obj.increaseSpeed();// Cars(super class) method
        obj.decreaseSpeed();//9



    }

}
