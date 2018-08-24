package training.car;

/**
 * Created by user on 21/11/2015.
 */
public class Runner {
    public static void main(String[] args) {
        int amountOfCars = 10;
        String colors[] = {"red", "black", "white", "blue", "yellow", "green", "gray", "black", "silver", "green"};
        String marks[] = {"BMW", "Mazda", "Audi", "BMW", "Mazda", "Audi", "BMW", "Mazda", "Audi", "BMW"};
        String models[] = {"sedan", "universal"};
        Car[] cars = new Car[amountOfCars];
        for (int i = 0; i < amountOfCars; i++) {
            cars[i] = new Car(i, marks[i % 10], models[i % 2], 2000 + i, colors[i % 10], 150 + i, 1000 * i + 35);
        }
        CarLogic carLogic = new CarLogic(cars);
        String mark = "BMW";
        System.out.println("Cars of the brand:  " + mark + " :");
        carLogic.printCarsOfDefinedMark(mark);
        String model = "sedan";
        int amountYear = 5;
        System.out.println(" ");
        System.out.println("Cars of the model " + model + " in expluatation more than " + amountYear + " years: ");
        carLogic.printCarsWithDefinedModelAndOlderThan(model, amountYear);
        int year = 2009;
        int price = 155;
        System.out.println(" ");
        System.out.println("Cars are maded in  " + year + " which price more than " + 155);
        carLogic.printCarsWithDefinedYearAndHigherPrice(year, price);
    }
}
