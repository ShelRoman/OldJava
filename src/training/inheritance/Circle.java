package training.inheritance;

/**
 * Created by user on 21/11/2015.
 */
public class Circle {

    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(final double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return length == ((Circle) (obj)).getLength();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (int) (Double.doubleToLongBits(length) ^ (Double.doubleToLongBits(length) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Circle length - " + length;
    }
}
