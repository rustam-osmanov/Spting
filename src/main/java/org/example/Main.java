package org.example;

public class Main {
    public static void main(String[] args) {

        CoffeeInstructionsDependencyInjection injection = new LatteInstructionsDependencyInjector();
        CoffeeInstructionsDependencyInjection injection2 = new EspressoInstructionsDependencyInjector();

        Barista barista = injection.getBarista();

        CoffeeShop coffeeShop = new CoffeeShop(barista);
    }
}
