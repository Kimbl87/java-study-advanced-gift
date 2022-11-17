package giftBasket.nomenclature;

public class Marshmallow extends AllSweets{
private int meltingPoint;

    public Marshmallow(String name, double weighGram, int price, int meltingPoint) {
        super(name, weighGram, price);
        this.meltingPoint = meltingPoint;
        }

    @Override
    public String toString() {
            return "Marshmallow + [" + super.toString() +
                    ", melting point = " + meltingPoint +
                    ']';
    }
}
