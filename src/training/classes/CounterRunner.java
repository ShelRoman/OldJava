package training.classes;

/**
 * Created by user on 21/11/2015.
 */
public class CounterRunner {

    public static void main(String[] args) {
        BathRoomCounter bathCounter = new BathRoomCounter(15);
        bathCounter.useBathroom(1);
        bathCounter.useBathroom(2);
        bathCounter.useBathroom(3);
        bathCounter.useBathroom(4);
        System.out.println(bathCounter.getAverageWaterPerUsage());
    }
}
