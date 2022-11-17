//- У каждой сладости есть название, вес, цена и свой уникальный параметр

package giftBasket.nomenclature;

public class AllSweets {
    private String name;
    private double weightGram;
    private double price;

    public AllSweets(String name, double weightGram, double price) {
        this.name = name;
        this.weightGram = weightGram;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeightGram() {
        return weightGram;
    }

    public void setWeightGram(double weightGram) {
        this.weightGram = weightGram;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name = " + name + ", weight in grams = " + weightGram + ", price = " + price;
    }
}
