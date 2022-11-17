package giftBasket;

import giftBasket.nomenclature.AllSweets;
import giftBasket.nomenclature.Candy;

public class Basket {
    public static void main(String[] args) {
        Candy redCandy = new Candy("Red candy", 6.5, 0.2, "red");
        Candy yellowCandy = new Candy("Yellow candy", 6.5, 0.25, "yellow");
        Candy kingSizeCandy = new Candy("King size candy", 12, 0.6, "rainbow");


        AllSweets[] basket = {
                redCandy,
                redCandy,
                redCandy,
                yellowCandy,
                yellowCandy,
                yellowCandy,
                kingSizeCandy};

        double totalPrice = 0;
        double totalWeight = 0;

        for (AllSweets someSweet : basket) {
            System.out.println(someSweet.toString());
        }
        //Складываем цену
        for (int i = 0; i < basket.length; i++) {
            totalPrice += basket[i].getPrice();
            totalWeight += basket[i].getWeightGram();
        }


        System.out.println("Total price: $" + String.format("%.2f", totalPrice));
        System.out.println("Total weight, gram: " + String.format("%.2f", totalWeight));
    }
}
