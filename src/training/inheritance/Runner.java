package training.inheritance;

/**
 * Created by user on 21/11/2015.
 */
public class Runner {

    public static void main(String[] args) {
        Disk disk1 = new Disk();
        Disk disk2 = new Disk();
        disk1.setLength(55);
        disk2.setLength(55);
        System.out.println("Disk 1 & Disk 2 same length: " + disk1.equals(disk2));
        disk1.setRadius(44);
        disk2.setRadius(43);
        System.out.println("Disk 1 == Disk 2 different radius: " + disk1.equals(disk2));
        disk2.setRadius(44);
        System.out.print("Trying to set negative length: ");
        disk1.setLength(-5);
        System.out.print("Trying to set zero radius: ");
        disk2.setRadius(0);
        Point x = new Point(3.4, 3);
        Point y = new Point();
        Point z = new Point();
        y.setCoordinates(5, 2);
        z.setCoordinates(3.4, 3);
        disk1.addPoint(x);
        disk2.addPoint(z);
        disk2.addPoint(y);
        System.out.println("Disk 1 == Disk 2 different points: " + disk1.equals(disk2));
        disk1.addPoint(y);
        System.out.println("Disk 1 == Disk 2 same points: " + disk1.equals(disk2));
        System.out.println("Trying to add duplicated point: " + disk1.addPoint(5, 2));
        System.out.println("Is added point inside the disk: " + disk1.isPointInDisk(x));
        Point w = new Point(19, 20);
        System.out.println("Is doesn't added point in the disk: " + disk1.isPointInDisk(w));
//        System.out.println("Is doesn't added point in the disk :" + disk1.isPointInDisk(22, 22));
        System.out.println("Disk1 == Disk2 same parameters: " + disk1.equals(disk2));
        System.out.println("Hashcode of disk 1: " + disk1.hashCode());
        System.out.println("Hashcode of disk 2: " + disk2.hashCode());
        disk2.addPoint(4, 9);
        System.out.println("Hashcode of disk 2 with added point: " + disk2.hashCode());
        System.out.print("№1 ");
        System.out.println(disk1);
        System.out.print("№2 ");
        System.out.println(disk2);
    }
}
