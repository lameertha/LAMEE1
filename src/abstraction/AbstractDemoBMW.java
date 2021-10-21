package abstraction;

/**
 * Created by Jay Vaghani on 28-Sep-2019
 */
public class AbstractDemoBMW extends AbstractCars{
    @Override
    public void abc(int a) {

    }

    @Override
    public void engineStart(String keyType, int numOfCyl) {
        System.out.println("This is the BMW engine start");
    }


    public static void main(String[] args) {
        AbstractDemoBMW ab = new AbstractDemoBMW();
        ab.setPrivateSpeed(10);
        ab.engineStart("keyLess",4);
    }
}
