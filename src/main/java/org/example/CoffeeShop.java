package org.example;

public class CoffeeShop {
     Barista barista;

    public CoffeeShop(Barista barista) {
        this.barista = barista;
        barista.makeCoffee();
    }
}
