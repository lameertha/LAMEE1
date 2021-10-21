package inheritance;

public class Cars {
  int speed;


    public Cars(int speed) {

        this.speed = speed;
    }

    public void increaseSpeed() {
        speed++;
        System.out.println("Increasing Speed of Cars ="+speed);
    }

    public void decreaseSpeed() {
        speed--;
        System.out.println("Decreasing Speed of Cars ="+speed);
    }
}
