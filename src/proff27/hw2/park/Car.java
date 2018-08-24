package proff27.hw2.park;

public class Car {
    private String number;
    private String model;
    private String color;

    public Car() {

    }

    public Car(String number, String model, String color) {
        this.number = number;
        this.model = model;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == null && obj == null) {
            return true;
        } else if  (this == null || obj == null) {
            return false;
        } else {
            Car car = (Car) obj;
            return this.color.equals(car.color) && this.model.equals(car.model) && this.number.equals(car.number);
        }

    }
}
