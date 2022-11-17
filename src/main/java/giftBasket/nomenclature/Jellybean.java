package giftBasket.nomenclature;

public class Jellybean extends AllSweets{
    private String flavor;

    public Jellybean(String name, double weighGram, double price, String flavor) {
        super(name, weighGram, price);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Jellybean [" + super.toString() +
                ", flavor='" + flavor + '\'' +
                ']';
    }
}
