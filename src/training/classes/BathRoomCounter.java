package training.classes;

/**
 * Created by user on 21/11/2015.
 */
public class BathRoomCounter extends DigitalCounter {
    private int waterUsed;

    public BathRoomCounter(final int max) {
        super(max);
    }

    public void useBathroom(int waterUsed) {
        increaseCounterByStep();
        this.waterUsed += waterUsed;
    }

    public int getAverageWaterPerUsage() {
        return waterUsed / (getCurrentValue() + (getCyclesMade() * (getMaxValue())));
    }
}
