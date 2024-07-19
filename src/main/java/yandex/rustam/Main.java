package yandex.rustam;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Barista barista = new Barista();
//        Instructions instructions = new EspressoInstructions();
//        barista.setLatteInstructions(instructions);
//        barista.makeCoffee();

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("yandex.rustam");
        Barista barista = applicationContext.getBean(Barista.class);
        barista.makeCoffee();
    }

}
