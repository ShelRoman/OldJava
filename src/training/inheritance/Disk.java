package training.inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 21/11/2015.
 */
public class Disk {

    private final static double PI = 3.14;
    private final Circle CIRCLE;
    private double radius;
    private double diameter;
    private double area;
    private List<Point> pointList;

    public Disk() {
        pointList = new ArrayList<>();
        CIRCLE = new Circle();
    }

    private boolean isInValidValue(final double value) {
        return value <= 0;
    }

    private void wrongValueMsg() {
        System.out.println("Negative or zero values aren't allowed");
    }

    private void changeSizeViaLength() {
        radius = getLength() / (2 * PI);
        diameter = getLength() / PI;
        setArea();
    }

    private void changeSizeViaRadius() {
        CIRCLE.setLength(2 * PI * radius);
        diameter = radius * 2;
        setArea();
    }

    private void setArea() {
        area = PI * (radius * radius);
    }

    public double getLength() {
        return CIRCLE.getLength();
    }

    public final void setLength(final double length) {
        if (isInValidValue(length)) {
            wrongValueMsg();
        } else {
            CIRCLE.setLength(length);
            changeSizeViaLength();
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(final double radius) {
        if (isInValidValue(radius)) {
            wrongValueMsg();
        } else {
            this.radius = radius;
            changeSizeViaRadius();
        }
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }

    public List<Point> getPointList() {
        return pointList;
    }

    public void setPointList(final List<Point> pointList) {
        this.pointList = pointList;
    }

    public boolean addPoint(final Point point) {
        if (!isCoordinatesValid(point.getCoordinates()[0], point.getCoordinates()[1])) {
            return false;
        } else if (isPointInDisk(point)) {
            return false;
        }
        return pointList.add(point);
    }

    public boolean addPoint(final double axisX, final double axisY) {
        if (!isCoordinatesValid(axisX, axisY)) {
            return false;
        } else if (isPointInDisk(axisX, axisY)) {
            return false;
        }
        return pointList.add(new Point(axisX, axisY));
    }

    private boolean isCoordinatesValid(final double axisX, final double axisY) {
        return ((axisX <= radius) && (axisX >= (-1 * radius)))
                && ((axisY <= radius) && (axisY >= (-1 * radius)));
    }

    public boolean isPointInDisk(final Point point) {
        return pointList.contains(point);
    }

    public boolean isPointInDisk(final double axisX, final double axisY) {
        return pointList.contains(new Point(axisX, axisY));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        } else {
            return area == ((Disk) (obj)).getArea()
                    && radius == ((Disk) (obj)).getRadius()
                    && diameter == ((Disk) (obj)).getDiameter()
                    && getLength() == ((Disk) (obj)).getLength()
                    && pointList.equals(((Disk) (obj)).getPointList());
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + (int) (Double.doubleToLongBits(radius) ^ (Double.doubleToLongBits(radius) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(diameter) ^ (Double.doubleToLongBits(diameter) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(area) ^ (Double.doubleToLongBits(area) >>> 32));
        hash = 13 * hash + CIRCLE.hashCode();
        if (!pointList.isEmpty()) {
            for (Point point : pointList) {
                hash = 13 * hash + point.hashCode();
            }
        }
        return hash;
    }

    @Override
    public String toString() {
        String result = "Disk properties:"
                + "\n" + "Radius - " + radius
                + "\n" + "Diameter - " + diameter
                + "\n" + "Area - " + area
                + "\n" + CIRCLE.toString()
                + "\n" + "Has " + pointList.size() + " point(s)";
        if (!pointList.isEmpty()) {
            for (int i = 0; i < pointList.size(); i++) {
                result += "\n" + "Point " + (i + 1) + " " + pointList.get(i).toString();
            }
        }
        result += "\n" + "----------------------------------------------------";
        return result;
    }
}
