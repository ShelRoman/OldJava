package training.car;

/**
 * Created by user on 21/11/2015.
 */
public class CarLogic {
    private Car[] cars;

    public CarLogic(Car[] cars) {
        this.cars = cars;
    }

    public void printCarsOfDefinedMark(String mark) {
        for (Car car : cars) {
            if (car.getMark().equals(mark)) {
                System.out.println(car);
            }
        }
    }

    public void printCarsWithDefinedModelAndOlderThan(String model, int year) {
        for (Car car : cars) {
            if (car.getModel().equals(model) && year <= (2015 - car.getYear())) {
                System.out.println(car);
            }
        }
    }

    public void printCarsWithDefinedYearAndHigherPrice(int year, int price) {
        for (Car car : cars) {
            if (car.getYear() == year && car.getPrice() > price) {
                System.out.println(car);
            }
        }
    }
}
