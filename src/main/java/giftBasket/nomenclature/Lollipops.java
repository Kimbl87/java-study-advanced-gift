package giftBasket.nomenclature;

public class Lollipops extends AllSweets{
    private double diameter;

    public Lollipops(String name, double weighGram, double price, double diameter) {
        super(name, weighGram, price);
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Lollipops [" + super.toString() +
                ", diameter=" + diameter +
                ']';
    }
}
