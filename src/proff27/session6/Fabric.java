//Teach factory to create waterTrucks with parameter litres in tank

package proff27.session6;

public class Fabric {

    public static void main(String[] args) {
        Car waterTruck = Fabric.create(CarTypes.TRUCK, 500);
    }

    public static Car create(CarTypes type) {
        switch (type) {
            case TRUCK:
                return new TruckCreator().create();
            case CABRIOLET:
                return new CabrioletCreator().create();
            case WATERTRUCK:
                return new WaterTruckCreator().create();
        }
        throw new RuntimeException("Unsupported type");
    }

    public static Car create(CarTypes type, int volume) {
        return new WaterTruckCreator().create(volume);
    }
}

interface CarCreator {
    Car create();
}

class TruckCreator implements CarCreator {
    @Override
    public Car create() {
        return new Truck();
    }
}

class CabrioletCreator implements CarCreator {
    @Override
    public Car create() {
        return new Cabriolet();
    }
}

class Car {

}

class Truck extends Car {

}

class Cabriolet extends Car {

}

class WaterTruckCreator implements CarCreator {
    @Override
    public Car create() {
        return new WaterTruck();
    }

    public Car create(int volume) {
        return new WaterTruck(volume);
    }
}

class WaterTruck extends Car {
    private int volume;

    public WaterTruck() {
    }

    public WaterTruck(int volume) {
        this.volume = volume;
    }
}

enum CarTypes {
    TRUCK, CABRIOLET, WATERTRUCK
}