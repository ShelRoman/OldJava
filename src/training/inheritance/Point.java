package training.inheritance;

/**
 * Created by user on 21/11/2015.
 */
public class Point {

    private final static int AXIS_X = 0;
    private final static int AXIS_Y = 1;
    private double[] coordinates;

    public Point() {
        coordinates = new double[2];
    }

    public Point(final double axisX, final double axisY) {
        coordinates = new double[]{axisX, axisY};
    }

    public double[] getCoordinates() {
        return coordinates;
    }

    public boolean setCoordinates(final double[] coordinates) {
        if (coordinates.length != 2) {
            return false;
        }
        this.coordinates = coordinates;
        return true;
    }

    public void setCoordinates(final double axisX, final double axisY) {
        coordinates[AXIS_X] = axisX;
        coordinates[AXIS_Y] = axisY;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return coordinates[AXIS_X] == ((Point) (obj)).getCoordinates()[AXIS_X]
                && coordinates[AXIS_Y] == ((Point) (obj)).getCoordinates()[AXIS_Y];
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + (int) (Double.doubleToLongBits(coordinates[AXIS_X]) ^ (Double.doubleToLongBits(coordinates[AXIS_X]) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(coordinates[AXIS_Y]) ^ (Double.doubleToLongBits(coordinates[AXIS_Y]) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "coordinates: "
                + "\n" + "Axis X - " + coordinates[AXIS_X]
                + "\n" + "Axis Y - " + coordinates[AXIS_Y];
    }

}
