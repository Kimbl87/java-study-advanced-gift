package sandbox.staff;

public abstract class Staff {
    public String brand;
    public Double price;

    public Staff(){}

    public Staff(String brand, Double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "brand = " + brand + ", price = " + price;
    }

}
