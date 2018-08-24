package training.classes;

/**
 * Created by user on 21/11/2015.
 */
public abstract class DigitalCounter {
    private final int MIN_VALUE = 0;
    private final int MAX_VALUE;
    private int currentValue;
    private int cyclesMade;

    public DigitalCounter(final int max) {
        MAX_VALUE = max;
        currentValue = MIN_VALUE;
    }

    void increaseCounterByStep() {
        currentValue ++;
        if (currentValue == MAX_VALUE) {
            currentValue = MIN_VALUE;
            cyclesMade++;
        }
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public int getCyclesMade() {
        return cyclesMade;
    }

    public int getMaxValue() {
        return MAX_VALUE;
    }

}
