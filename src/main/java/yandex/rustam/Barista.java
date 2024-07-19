package yandex.rustam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Barista {
    @Autowired
    private Instructions latteInstructions;
//
//    public Barista(Instructions latteInstructions) {
//        this.latteInstructions = latteInstructions;
//    }

    //    @Autowired
//    public void setLatteInstructions(Instructions latteInstructions) {
//        this.latteInstructions = latteInstructions;
//    }

    public void makeCoffee(){
        System.out.println("Получаем рецепт " + latteInstructions.getInstructions());
        System.out.println("Готовлю "+ latteInstructions.getCoffeName());
    }
}
