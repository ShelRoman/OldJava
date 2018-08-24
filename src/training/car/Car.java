package training.car;

/**
 * Created by user on 21/11/2015.
 */
public class Car {
    private int id;
    private String mark;
    private String model;
    private int year;
    private String color;
    private int price;
    private int regN;

    public Car(int id, String mark, String model, int year, String color, int price, int regN) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.regN = regN;
    }

    public String toString() {
        String res = "Car[ \n id: " + this.getId();
        res = res + "\n";
        res = res + "mark: " + this.getMark();
        res = res + "\n";
        res = res + "model: " + this.getModel();
        res = res + "\n";
        res = res + "year: " + this.getYear();
        res = res + "\n";
        res = res + "color: " + this.getColor();
        res = res + "\n";
        res = res + "price: " + this.getPrice();
        res = res + "\n";
        res = res + "registration number: " + this.getRegN();
        res = res + "\n ]";
        return res;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the mark
     */
    public String getMark() {
        return mark;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @return the regN
     */
    public int getRegN() {
        return regN;
    }
}
