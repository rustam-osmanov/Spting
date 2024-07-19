package org.example;

public class Barista {
    Instructions latteInstructions;


    public void setLatteInstructions(Instructions latteInstructions) {
        this.latteInstructions = latteInstructions;
    }

    public void makeCoffee(){
        System.out.println("Получаем рецепт " + latteInstructions.getInstructions());
        System.out.println("Готовлю "+ latteInstructions.getCoffeName());
    }
}
