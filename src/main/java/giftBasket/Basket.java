package giftBasket;

import giftBasket.nomenclature.*;

public class Basket {
    public static void main(String[] args) {
        Candy redCandy = new Candy("Red candy", 6.5, 0.2, "red");
        Candy yellowCandy = new Candy("Yellow candy", 6.5, 0.25, "yellow");
        Candy kingSizeCandy = new Candy("King size candy", 12, 0.6, "rainbow");
        Jellybean strawberryJellybean = new Jellybean("Strawberry jellybean", 30, 1, "strawberry");
        Jellybean vanillaJellybean = new Jellybean("Vanilla jellybean", 30, 1, "vanilla");
        Jellybean orangeJellybean = new Jellybean("Orange jellybean", 30, 1, "orange");
        Lollipops chordettesLollipops = new Lollipops("Chordettes", 12, 1.5, 5);
        Marshmallow cloudletMarshmallow = new Marshmallow("Сloudlet", 50, 3, 245);
        Marshmallow infusibleMarshmallow = new Marshmallow("Burly", 32, 3.5, 310);

        AllSweets[] basket = {
                redCandy,
                redCandy,
                redCandy,
                yellowCandy,
                yellowCandy,
                yellowCandy,
                kingSizeCandy,
                strawberryJellybean,
                vanillaJellybean,
                orangeJellybean,
                chordettesLollipops,
                cloudletMarshmallow,
                infusibleMarshmallow};

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
