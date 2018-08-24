package proff27.session2;

import org.jetbrains.annotations.NotNull;

public class Phone implements Comparable<Phone> {

    @Override
    public int compareTo(@NotNull Phone phone) {
        return Double.compare(phone.getPrice(), this.getPrice());
    }

    private String vendor;
    private double price;
    private boolean sex;

    public Phone() {
    }

    public Phone(String vendor, double price, boolean sex) {
        setVendor(vendor);
        setPrice(price);
        setSex(sex);
    }

    public String getVendor() {
        return this.vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "vendor='" + vendor + '\'' +
                ", price=" + price +
                ", sex=" + sex +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        Phone phone = (Phone)obj;

        return phone.isSex() == this.isSex()
                && Double.compare(phone.getPrice(), this.getPrice()) == 0
                && phone.getVendor() != null
                && phone.getVendor().equals(this.getVendor());
    }

    @Override
    public int hashCode() {
        int price = 31 * (int)Double.doubleToLongBits(this.getPrice());
        int vendor = 31 * this.getVendor().hashCode();
        int sex = isSex() ? 1 : 0;
        return 31 * (sex + price + vendor);

    }

}
