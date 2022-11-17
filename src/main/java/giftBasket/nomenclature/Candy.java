package giftBasket.nomenclature;

public class Candy extends AllSweets {
    private String color;

    public Candy(String name, double weighGram, double price, String color) {
        super(name, weighGram, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Candy [" + super.toString() +
                ", color='" + color + '\'' +
                ']';
    }
}
