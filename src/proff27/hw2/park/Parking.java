package proff27.hw2.park;

import java.util.HashMap;
import java.util.Map;

public class Parking {
    private int maxSize = 10;
    private Map<Integer, Car> parking;

    public Parking() {
        initializeParking();
    }

    private void initializeParking() {
        parking = new HashMap<>();
        for (int i = 1; i <= maxSize ; i++) {
            parking.put(i, null);
        }
    }

    public int park(Car car) throws ParkFullException {
        if (isFull()) {
            throw new ParkFullException("Parking is full, go away!");
        } else {
            int parkPlace = getFreePlace();
            parking.put(parkPlace, car);
            return parkPlace;
        }
    }

    private int getFreePlace() {
        for (int i = 1; i < parking.size(); i++) {
            if (parking.get(i) == null) {
                return i;
            }
        }
        return -1;
    }

    private boolean isFull() {
        return getFreePlace() == -1;
    }

    public Car leave(int placeNumber) {
        if (!isParkPlaceValid(placeNumber)) {
            throw new IndexOutOfBoundsException("Wrong parkingPlace, go away!");
        } else if (parking.get(placeNumber) == null) {
            throw new IndexOutOfBoundsException("Empty parkPlace, choose another");
        } else {
            Car parkedCar = parking.get(placeNumber);
            parking.put(placeNumber, null);
            return  parkedCar;
        }
    }

    private boolean isParkPlaceValid(int placeNumber) {
        return placeNumber > 0 && placeNumber <= maxSize;
    }
}
